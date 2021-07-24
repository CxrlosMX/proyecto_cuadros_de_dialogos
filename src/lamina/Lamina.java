/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamina;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import sun.util.locale.provider.JRELocaleConstants;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 20/07/2021
 *
 */
public class Lamina extends JPanel {

    //Creamos nuestas dos ventanas
    private JPanel lamina2;
    private JPanel lamina3;

    //Grupo y RadioButton Tipo, caja
    private JLabel tipo;
    private ButtonGroup grupoTipo;
    private JRadioButton mensaje, confirmar, opcion, entrada;
    private Box cajaTipo;

    //Tipo de Mensaje
    private JLabel tipoMensaje;
    private ButtonGroup grupoMensaje;
    private JRadioButton error, informacion, advertencia, pregunta, planoM;
    private Box cajaTipoMensaje;

    //Mensaje
    private JLabel mensajeIm;
    private ButtonGroup grupoMens;
    private JRadioButton cadena, icono, componente, otros, listObj;
    private Box cajaMensaje;

    //Confirmar 
    private JLabel mensajeConfirmar;
    private ButtonGroup grupoConfirmar;
    private JRadioButton defaultOp, yesNo, yesNoOp, okCancel;
    private Box cajaConfirmar;

    //Opcion
    private JLabel mensajeOpcion;
    private ButtonGroup grupoOpcion;
    private JRadioButton listSring, listIcon, objList;
    private Box cajaOpcion;

    //Entrada
    private JLabel mensajeEntrada;
    private ButtonGroup grupoEntrada;
    private JRadioButton campoTexto, combo;
    private Box cajaEntrada;

    //Componentes que usaremos
    private JButton mostrar;

    public Lamina() {
        setLayout(new BorderLayout());
        //Lamina de arriba
        lamina2 = new JPanel();
        lamina2.setLayout(new GridLayout(2, 3));

        //---------------
        /*
         Creando Grupos de radioButton
        
         *///Tipo
        tipo = new JLabel("Tipo");
        tipo.setMaximumSize(tipo.getPreferredSize());
        //Grupo
        grupoTipo = new ButtonGroup();
        //RadioButton
        mensaje = new JRadioButton("Mensaje", true);
        confirmar = new JRadioButton("Confirmar");
        opcion = new JRadioButton("Opción");
        entrada = new JRadioButton("Entrada");
        //Agregamos los botones al su grupo
        grupoTipo.add(mensaje);
        grupoTipo.add(confirmar);
        grupoTipo.add(opcion);
        grupoTipo.add(entrada);
        //Creamos nuestra caja
        cajaTipo = Box.createVerticalBox();
        //Le ponemos un borde a nuestra caja
        cajaTipo.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), tipo.getText()));

        //Especificamos la distancia entre los componentes
        cajaTipo.add(Box.createVerticalStrut(5));
        //Metodo para pintar el margen de la caja

        //cajaTipo.paintComponents(new Graphics2D);
        //Agregamos los componentes a nuestra primera Box
        cajaTipo.add(mensaje);
        cajaTipo.add(confirmar);
        cajaTipo.add(opcion);
        cajaTipo.add(entrada);

        //Agregamos nuestra primera caja a nuetra lamina
        lamina2.add(cajaTipo);

        //------
        //Creamos La siguiente Caja con Tipo de Mensaje
        tipoMensaje = new JLabel("Tipo de Mensaje");
        tipoMensaje.setMaximumSize(tipoMensaje.getPreferredSize());
        //Grupo
        grupoMensaje = new ButtonGroup();
        //Creamos los RadioButton
        //error, informacion, advertencia, pregunta, planoM
        error = new JRadioButton("ERROR_MESSAGE", true);
        informacion = new JRadioButton("INFORMATION_MESSAGE");
        advertencia = new JRadioButton("WARNING_MESSAGE");
        pregunta = new JRadioButton("QUESTION_MESSAGE");
        planoM = new JRadioButton("PLAIN_MESSAGE");
        //Agregamos los RadioButton a nuestro grupo
        grupoMensaje.add(error);
        grupoMensaje.add(informacion);
        grupoMensaje.add(advertencia);
        grupoMensaje.add(pregunta);
        grupoMensaje.add(planoM);

        //Creamos nuestra caja
        cajaTipoMensaje = Box.createVerticalBox();
        cajaTipoMensaje.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), tipoMensaje.getText()));
        cajaTipoMensaje.add(Box.createVerticalStrut(5));
        //Agregamos los componentes a nuestra caja
        //  cajaTipoMensaje.add(tipoMensaje);
        cajaTipoMensaje.add(error);
        cajaTipoMensaje.add(informacion);
        cajaTipoMensaje.add(advertencia);
        cajaTipoMensaje.add(pregunta);
        cajaTipoMensaje.add(planoM);

        //Agregamos nuestra caja a nuestra lamina con disposicion GridLayout
        lamina2.add(cajaTipoMensaje);

        //------
        //Mensaje
        mensajeIm = new JLabel("Mensaje");
        mensajeIm.setPreferredSize(mensajeIm.getPreferredSize());
        grupoMens = new ButtonGroup();
        //cadena, icono, componentes, otros, listObj;
        cadena = new JRadioButton("Cadena", true);
        icono = new JRadioButton("Icono");
        componente = new JRadioButton("Componente");
        otros = new JRadioButton("Otros");
        listObj = new JRadioButton("Object[]");

        grupoMens.add(cadena);
        grupoMens.add(icono);
        grupoMens.add(componente);
        grupoMens.add(otros);
        grupoMens.add(listObj);
        //Creamos nuestra caja+
        cajaMensaje = Box.createVerticalBox();
        cajaMensaje.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), mensajeIm.getText()));
        cajaMensaje.add(Box.createVerticalStrut(5));
        // cajaMensaje.add(mensajeIm);
        cajaMensaje.add(cadena);
        cajaMensaje.add(icono);
        cajaMensaje.add(componente);
        cajaMensaje.add(otros);
        cajaMensaje.add(listObj);
        lamina2.add(cajaMensaje);

        //Confirmar
        mensajeConfirmar = new JLabel("Confirmar");
        mensajeConfirmar.setMaximumSize(mensajeConfirmar.getPreferredSize());
        grupoConfirmar = new ButtonGroup();
        //Botones
        // defaultOp, yesNo, yesNoOp, okCancel
        defaultOp = new JRadioButton("DEFAULT_OPTION", true);
        yesNo = new JRadioButton("YES_NO_OPTION");
        yesNoOp = new JRadioButton("YES_NO_CANCEL_OPTION");
        okCancel = new JRadioButton("OK_CANCEL_OPTION");
        //Agregamos los botones a nuestro grupo
        grupoConfirmar.add(defaultOp);
        grupoConfirmar.add(yesNo);
        grupoConfirmar.add(yesNoOp);
        grupoConfirmar.add(okCancel);
        //Creamos nuestra caja
        cajaConfirmar = Box.createVerticalBox();
        cajaConfirmar.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), mensajeConfirmar.getText()));
        cajaConfirmar.add(Box.createVerticalStrut(5));

        //cajaConfirmar.add(mensajeConfirmar);
        cajaConfirmar.add(defaultOp);
        cajaConfirmar.add(yesNo);
        cajaConfirmar.add(yesNoOp);
        cajaConfirmar.add(okCancel);
        //Agregamos nuestra caja a la lamina
        lamina2.add(cajaConfirmar);
        //-----------
        //Opcion
        mensajeOpcion = new JLabel("Opción");
        mensajeOpcion.setMaximumSize(mensajeOpcion.getPreferredSize());
        grupoOpcion = new ButtonGroup();

        listSring = new JRadioButton("String[]", true);
        listIcon = new JRadioButton("Icon[]");
        objList = new JRadioButton("Object[]");

        grupoOpcion.add(listSring);
        grupoOpcion.add(listIcon);
        grupoOpcion.add(objList);

        cajaOpcion = Box.createVerticalBox();
        cajaOpcion.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), mensajeOpcion.getText()));
        cajaOpcion.add(Box.createVerticalStrut(5));
        //cajaOpcion.add(mensajeOpcion);
        cajaOpcion.add(listSring);
        cajaOpcion.add(listIcon);
        cajaOpcion.add(objList);

        lamina2.add(cajaOpcion);

        //Entrada 
        mensajeEntrada = new JLabel("Entrada");
        mensajeEntrada.setMaximumSize(mensajeEntrada.getPreferredSize());
        grupoEntrada = new ButtonGroup();
        campoTexto = new JRadioButton("Campo de Texto", true);
        combo = new JRadioButton("Combo");
        grupoEntrada.add(campoTexto);
        grupoEntrada.add(combo);

        //Creando caja
        cajaEntrada = Box.createVerticalBox();
        cajaEntrada.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), mensajeEntrada.getText()));
        cajaEntrada.add(Box.createVerticalStrut(5));
        //   cajaEntrada.add(mensajeEntrada);
        cajaEntrada.add(campoTexto);
        cajaEntrada.add(combo);

        lamina2.add(cajaEntrada);
        //Creando la lamina 2
        lamina3 = new JPanel();
        lamina3.setLayout(new BorderLayout());

        //Boton para mostrar el mensaje
        mostrar = new JButton("Mostrar");
        mostrar.addActionListener(new EventoDialogo());
        //Agregamos nuestro boton a la lamina superior
        lamina3.add(mostrar, BorderLayout.CENTER);
        //Agregamos las laminas
        add(lamina2, BorderLayout.CENTER);
        add(lamina3, BorderLayout.SOUTH);

    }

    private int mensajeTipo() {

        if (error.isSelected()) {
            return 0;
        } else if (informacion.isSelected()) {
            return 1;
        } else if (advertencia.isSelected()) {
            return 2;
        } else if (pregunta.isSelected()) {
            return 3;
        } else {
            return -1;
        }
    }

    private int mensajeConfirmar() {
        //defaultOp, yesNo, yesNoOp, okCancel;
        if (defaultOp.isSelected()) {
            return JOptionPane.DEFAULT_OPTION;
        } else if (yesNo.isSelected()) {
            return JOptionPane.YES_NO_OPTION;
        } else if (yesNoOp.isSelected()) {
            return JOptionPane.YES_NO_CANCEL_OPTION;
        } else {
            return JOptionPane.OK_CANCEL_OPTION;
        }
    }

    private Object[] objetos() {
        //listSring, listIcon, objList
        Object[] arreglo = null;
        if (listSring.isSelected()) {
            arreglo = new Object[]{"Rojo", "Azul", "Negro"};

        } else if (listIcon.isSelected()) {
            arreglo = new Object[]{new ImageIcon("src/azul.png"), new ImageIcon("src/rojo.png"), new ImageIcon("src/amarillo.png")};

        } else {
            ImageIcon ic = new ImageIcon("src/azul.png");
            JPanel l = new JPanel();
            l.setBackground(Color.yellow);
            Date fecha = new Date();
            arreglo = new Object[]{"Cadena", ic, l, fecha};

        }
        return arreglo;
    }

    private Object[] objetosEntrada() {
        //  JComboBox grupo = null;
        Object[] arreglo = null;
        if (combo.isSelected()) {
            arreglo = new Object[]{"Rojo", "Azul", "Amarillo"};
        }
        if(campoTexto.isSelected()){
        
      
        }

        return arreglo;
    }

    private class EventoDialogo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int n = mensajeTipo();
            int m = mensajeConfirmar();
            ImageIcon ic = new ImageIcon("src/azul.png");
            JPanel l = new JPanel();
            l.setBackground(Color.yellow);
            Date fecha = new Date();
            Object[] lista = objetos();
            Object[] b = objetosEntrada();
            if (e.getSource() == mostrar) {
                //Opción Mensaje
                if (mensaje.isSelected()) {

                    //opción para la cadena
                    if (cadena.isSelected()) {

                        JOptionPane.showMessageDialog(Lamina.this, cadena.getText(), "Mensaje", n);
                    }
                    //Icono
                    if (icono.isSelected()) {
                        JOptionPane.showMessageDialog(Lamina.this, ic, "Mensaje", n);
                    }
                    //Componente
                    if (componente.isSelected()) {

                        JOptionPane.showMessageDialog(Lamina.this, l, "Mensaje", n);
                    }
                    if (otros.isSelected()) {
                        JOptionPane.showMessageDialog(Lamina.this, fecha, "Mensaje", n);
                    }
                    if (listObj.isSelected()) {
                        String cadena = "Cadena";
                        Object[] arreglo = {cadena, ic, l, fecha};

                        JOptionPane.showMessageDialog(Lamina.this, arreglo, "Mensaje", n);
                    }
                } //Opción Confirmar
                else if (confirmar.isSelected()) {

                    //opción para la cadena
                    if (cadena.isSelected()) {
                        JOptionPane.showOptionDialog(Lamina.this, cadena.getText(), "Opción", m, n, null, null, null);

                        //JOptionPane.showMessageDialog(Lamina.this, cadena.getText(), "Mensaje", n);
                    }
                    //Icono
                    if (icono.isSelected()) {
                        JOptionPane.showOptionDialog(Lamina.this, ic, "Opción", m, n, null, null, null);

                    }
                    //Componente
                    if (componente.isSelected()) {

                        JOptionPane.showOptionDialog(Lamina.this, l, "Opción", m, n, null, null, null);

                    }
                    if (otros.isSelected()) {
                        JOptionPane.showOptionDialog(Lamina.this, fecha, "Opción", m, n, null, null, null);

                    }
                    if (listObj.isSelected()) {
                        String cadena = "Cadena";
                        Object[] arreglo = {cadena, ic, l, fecha};

                        JOptionPane.showOptionDialog(Lamina.this, arreglo, "Opción", m, n, null, null, null);

                    }
                } //Opción "Opción"
                else if (opcion.isSelected()) {
                    //opción para la cadena
                    if (cadena.isSelected()) {
                        JOptionPane.showOptionDialog(Lamina.this, cadena.getText(), "Opción", m, n, null, lista, null);

                        //JOptionPane.showMessageDialog(Lamina.this, cadena.getText(), "Mensaje", n);
                    }
                    //Icono
                    if (icono.isSelected()) {
                        JOptionPane.showOptionDialog(Lamina.this, ic, "Opción", m, n, null, lista, null);

                    }
                    //Componente
                    if (componente.isSelected()) {

                        JOptionPane.showOptionDialog(Lamina.this, l, "Opción", m, n, null, lista, null);

                    }
                    if (otros.isSelected()) {
                        JOptionPane.showOptionDialog(Lamina.this, fecha, "Opción", m, n, null, lista, null);

                    }
                    if (listObj.isSelected()) {
                        String cadena = "Cadena";
                        Object[] arreglo = {cadena, ic, l, fecha};

                        JOptionPane.showOptionDialog(Lamina.this, arreglo, "Opción", m, n, null, lista, null);

                    }
                } else {
                    if (cadena.isSelected()) {
                        JOptionPane.showInputDialog(Lamina.this, cadena.getText(), "Entrada", n, null, b, null);
                        //JOptionPane.showMessageDialog(Lamina.this, cadena.getText(), "Mensaje", n);
                    }
                    //Icono
                    if (icono.isSelected()) {
                        JOptionPane.showInputDialog(Lamina.this, ic, "Entrada", n, null, b, null);

                    }
                    //Componente
                    if (componente.isSelected()) {
                        JOptionPane.showInputDialog(Lamina.this, l, "Entrada", n, null, b, null);
                    }
                    if (otros.isSelected()) {
                        JOptionPane.showInputDialog(Lamina.this, fecha, "Entrada", n, null, b, null);

                    }
                    if (listObj.isSelected()) {
                        String cadena = "Cadena";
                        Object[] arreglo = {cadena, ic, l, fecha};

                        JOptionPane.showInputDialog(Lamina.this, arreglo, "Entrada", n, null, b, null);

                    }

                }

            }
        }

    }

}
