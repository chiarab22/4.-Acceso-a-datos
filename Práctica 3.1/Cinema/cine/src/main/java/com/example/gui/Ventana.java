package com.example.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import com.example.base.Actor;
import com.example.gui.JActor.Accion;
import com.example.hibernate.util.HibernateUtil;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana {

    private JFrame frmCine;
    private JLabel lbEstado;
    private JMenuBar menuBar;
    private JMenu mnArchivo;
    private JMenuItem mntmNewMenuItem;
    private JToolBar toolBar;
    private JTabbedPane tabbedPane;
    private JPanel tabActores;
    private JPanel tabDirectores;
    private JPanel tabPeliculas;
    private JButton btAnadir;
    private JButton btModificar;
    private JButton btEliminar;
    private JButton btGuardar;
    private JScrollPane scrollPane;
    private JScrollPane scrollPane_1;
    private JScrollPane scrollPane_2;
    private JTable table;
    private JTable table_1;
    private JTable table_2;

    public static void lanzar(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ventana window = new Ventana();
                    window.frmCine.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Ventana() {
        initialize();
        inicializar();
    }

    private void inicializar() {

        try {
            HibernateUtil.buildSessionFactory();
            HibernateUtil.openSession();

            cargarDatos();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
    }

    private void cargarDatos() {

    }

    private void alta() {

        switch (tabbedPane.getSelectedIndex()) {
            case 0:
                altaActor();
                break;
            case 1:
                altaDirector();
                break;
            case 2:
                altaPelicula();
                break;
            default:
        }
    }

    private void altaActor() {

        JActor jActor = new JActor();
        if (jActor.mostrarDialogo() == Accion.CANCELAR)
            return;

        Actor actor = jActor.getActor();
        Session sesion = HibernateUtil.getCurrentSession();
        sesion.beginTransaction();
        sesion.save(actor);
        sesion.getTransaction().commit();
        sesion.close();
    }

    private void altaDirector() {

    }

    private void altaPelicula() {

    }

    private void initialize() {
        frmCine = new JFrame();
        frmCine.setTitle("Cine");
        frmCine.setBounds(100, 100, 580, 477);
        frmCine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCine.getContentPane().add(getLbEstado(), BorderLayout.SOUTH);
        frmCine.getContentPane().add(getToolBar(), BorderLayout.NORTH);
        frmCine.getContentPane().add(getTabbedPane(), BorderLayout.CENTER);
        frmCine.setJMenuBar(getMenuBar());
    }

    public JLabel getLbEstado() {
        if (lbEstado == null) {
            lbEstado = new JLabel("Cine ");
        }
        return lbEstado;
    }
    public JMenuBar getMenuBar() {
        if (menuBar == null) {
            menuBar = new JMenuBar();
            menuBar.add(getMnArchivo());
        }
        return menuBar;
    }
    public JMenu getMnArchivo() {
        if (mnArchivo == null) {
            mnArchivo = new JMenu("Archivo");
            mnArchivo.add(getMntmNewMenuItem());
        }
        return mnArchivo;
    }
    public JMenuItem getMntmNewMenuItem() {
        if (mntmNewMenuItem == null) {
            mntmNewMenuItem = new JMenuItem("Salir");
        }
        return mntmNewMenuItem;
    }
    public JToolBar getToolBar() {
        if (toolBar == null) {
            toolBar = new JToolBar();
            toolBar.add(getBtAnadir());
            toolBar.add(getBtModificar());
            toolBar.add(getBtEliminar());
            toolBar.add(getBtGuardar());
        }
        return toolBar;
    }
    public JTabbedPane getTabbedPane() {
        if (tabbedPane == null) {
            tabbedPane = new JTabbedPane(JTabbedPane.TOP);
            tabbedPane.addTab("Actores", null, getTabActores(), null);
            tabbedPane.addTab("Directores", null, getTabDirectores(), null);
            tabbedPane.addTab("Pel\u00EDculas", null, getTabPeliculas(), null);
        }
        return tabbedPane;
    }
    public JPanel getTabActores() {
        if (tabActores == null) {
            tabActores = new JPanel();
            tabActores.setLayout(new BorderLayout(0, 0));
            tabActores.add(getScrollPane(), BorderLayout.CENTER);
        }
        return tabActores;
    }
    public JPanel getTabDirectores() {
        if (tabDirectores == null) {
            tabDirectores = new JPanel();
            tabDirectores.setLayout(new BorderLayout(0, 0));
            tabDirectores.add(getScrollPane_1(), BorderLayout.CENTER);
        }
        return tabDirectores;
    }
    public JPanel getTabPeliculas() {
        if (tabPeliculas == null) {
            tabPeliculas = new JPanel();
            tabPeliculas.setLayout(new BorderLayout(0, 0));
            tabPeliculas.add(getScrollPane_2(), BorderLayout.CENTER);
        }
        return tabPeliculas;
    }
    public JButton getBtAnadir() {
        if (btAnadir == null) {
            btAnadir = new JButton("A??adir");
            btAnadir.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    alta();
                }
            });
        }
        return btAnadir;
    }
    public JButton getBtModificar() {
        if (btModificar == null) {
            btModificar = new JButton("Modificar");
        }
        return btModificar;
    }
    public JButton getBtEliminar() {
        if (btEliminar == null) {
            btEliminar = new JButton("Eliminar");
        }
        return btEliminar;
    }
    public JButton getBtGuardar() {
        if (btGuardar == null) {
            btGuardar = new JButton("Guardar");
        }
        return btGuardar;
    }
    public JScrollPane getScrollPane() {
        if (scrollPane == null) {
            scrollPane = new JScrollPane();
            scrollPane.setViewportView(getTable());
        }
        return scrollPane;
    }
    public JScrollPane getScrollPane_1() {
        if (scrollPane_1 == null) {
            scrollPane_1 = new JScrollPane();
            scrollPane_1.setViewportView(getTable_1());
        }
        return scrollPane_1;
    }
    public JScrollPane getScrollPane_2() {
        if (scrollPane_2 == null) {
            scrollPane_2 = new JScrollPane();
            scrollPane_2.setViewportView(getTable_2());
        }
        return scrollPane_2;
    }
    public JTable getTable() {
        if (table == null) {
            table = new JTable();
        }
        return table;
    }
    public JTable getTable_1() {
        if (table_1 == null) {
            table_1 = new JTable();
        }
        return table_1;
    }
    public JTable getTable_2() {
        if (table_2 == null) {
            table_2 = new JTable();
        }
        return table_2;
    }
}
