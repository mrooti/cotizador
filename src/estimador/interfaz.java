/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estimador;
import java.awt.*;
import java.text.DecimalFormat;
import javax.swing.*;
/**
 *
 * @author rogelio
 */
public class interfaz {
    private JFrame frame=new JFrame();
    private JPanel panel;
    private JLabel titulo;
    private JLabel subtitulo,por;
    private JButton pf,cocomo1,cocomo2;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel alta;
    private javax.swing.JLabel archivos_i;
    private javax.swing.JLabel archivos_l;
    private javax.swing.JLabel baja;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c10;
    private javax.swing.JComboBox<String> c11;
    private javax.swing.JComboBox<String> c12;
    private javax.swing.JComboBox<String> c13;
    private javax.swing.JComboBox<String> c14;
    private javax.swing.JComboBox<String> c2;
    private javax.swing.JComboBox<String> c3;
    private javax.swing.JComboBox<String> c4;
    private javax.swing.JComboBox<String> c5;
    private javax.swing.JComboBox<String> c6;
    private javax.swing.JComboBox<String> c7;
    private javax.swing.JComboBox<String> c8;
    private javax.swing.JComboBox<String> c9;
    private javax.swing.JTextField c_a;
    private javax.swing.JTextField c_b;
    private javax.swing.JTextField c_m;
    private javax.swing.JLabel caracteristicas;
    private javax.swing.JLabel complejidad;
    private javax.swing.JLabel consultas;
    private javax.swing.JTextField e_a;
    private javax.swing.JTextField e_b;
    private javax.swing.JTextField e_m;
    private javax.swing.JLabel entradas;
    private javax.swing.JLabel factor_c;
    private javax.swing.JTextField fc;
    private javax.swing.JTextField i_a;
    private javax.swing.JTextField i_b;
    private javax.swing.JTextField i_m;
    private javax.swing.JTextField kldc=new JTextField();
    private javax.swing.JTextField l_a;
    private javax.swing.JTextField l_b;
    private javax.swing.JLabel l_c1;
    private javax.swing.JLabel l_c10;
    private javax.swing.JLabel l_c11;
    private javax.swing.JLabel l_c12;
    private javax.swing.JLabel l_c13;
    private javax.swing.JLabel l_c14;
    private javax.swing.JLabel l_c15;
    private javax.swing.JLabel l_c2;
    private javax.swing.JLabel l_c3;
    private javax.swing.JLabel l_c4;
    private javax.swing.JLabel l_c5;
    private javax.swing.JLabel l_c6;
    private javax.swing.JLabel l_c7;
    private javax.swing.JLabel l_c8;
    private javax.swing.JLabel l_c9;
    private javax.swing.JTextField l_m;
    private javax.swing.JTextField ldc=new JTextField();
    private javax.swing.JComboBox<String> lenguaje;
    private javax.swing.JLabel lenguaje_de;
    private javax.swing.JLabel lines;
    private javax.swing.JLabel media;
    private javax.swing.JLabel miles;
    private javax.swing.JPanel panel_carac;
    private javax.swing.JPanel panel_co;
    private javax.swing.JPanel panel_leng;
    private javax.swing.JPanel panel_result;
    private javax.swing.JLabel parametros;
    private javax.swing.JLabel pf_s;
    private javax.swing.JTextField pfa;
    private javax.swing.JTextField pfs;
    private javax.swing.JLabel puntos_aj;
    private javax.swing.JLabel result;
    private javax.swing.JTextField s_a;
    private javax.swing.JTextField s_b;
    private javax.swing.JTextField s_m;
    private javax.swing.JLabel salidad;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JLabel significativos;
    private javax.swing.JTextField otro;
    private JButton volver;
    private javax.swing.ButtonGroup acap;
    private javax.swing.JLabel e_h_l;
    private javax.swing.JLabel h_l;
    private javax.swing.ButtonGroup aexp;
    private javax.swing.JButton calcular;
    private javax.swing.JTextField costo;
    private javax.swing.JTextField costo_total;
    private javax.swing.ButtonGroup cplx;
    private javax.swing.ButtonGroup data;
    private javax.swing.JTextField e;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton42;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton47;
    private javax.swing.JRadioButton jRadioButton48;
    private javax.swing.JRadioButton jRadioButton49;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton50;
    private javax.swing.JRadioButton jRadioButton51;
    private javax.swing.JRadioButton jRadioButton52;
    private javax.swing.JRadioButton jRadioButton53;
    private javax.swing.JRadioButton jRadioButton54;
    private javax.swing.JRadioButton jRadioButton55;
    private javax.swing.JRadioButton jRadioButton56;
    private javax.swing.JRadioButton jRadioButton57;
    private javax.swing.JRadioButton jRadioButton58;
    private javax.swing.JRadioButton jRadioButton59;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton60;
    private javax.swing.JRadioButton jRadioButton61;
    private javax.swing.JRadioButton jRadioButton62;
    private javax.swing.JRadioButton jRadioButton63;
    private javax.swing.JRadioButton jRadioButton64;
    private javax.swing.JRadioButton jRadioButton65;
    private javax.swing.JRadioButton jRadioButton66;
    private javax.swing.JRadioButton jRadioButton67;
    private javax.swing.JRadioButton jRadioButton68;
    private javax.swing.JRadioButton jRadioButton69;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_l;
    private javax.swing.JLabel l_modo;
    private javax.swing.JLabel l_nivel;
    private javax.swing.ButtonGroup lexp;
    private javax.swing.JLabel manejado_la;
    private javax.swing.JComboBox<String> modo;
    private javax.swing.ButtonGroup modp;
    private javax.swing.JLabel n_l;
    private javax.swing.JComboBox<String> nivel;
    private javax.swing.JTextField p;
    private javax.swing.ButtonGroup pcap;
    private javax.swing.JTextField pr;
    private javax.swing.ButtonGroup rely;
    private javax.swing.ButtonGroup sced;
    private javax.swing.ButtonGroup stor;
    private javax.swing.JTextField t;
    private javax.swing.ButtonGroup time;
    private javax.swing.ButtonGroup tool;
    private javax.swing.ButtonGroup turn;
    private javax.swing.JLabel v_h_l;
    private javax.swing.ButtonGroup vexp;
    private javax.swing.ButtonGroup virt;
    private javax.swing.JLabel vl_l;
    public interfaz(){
        panel = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        por = new javax.swing.JLabel();
        pf = new javax.swing.JButton();
        cocomo1 = new javax.swing.JButton();
        cocomo2 = new javax.swing.JButton();

        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 350, 200);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        titulo.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        titulo.setText("Bienvenido al estimador");

        subtitulo.setText("Elige un método de estimación");

        por.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        por.setText("By Rogelio Fuentes");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(subtitulo)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(por)
                        .addGap(140, 140, 140))))
        );
        panelLayout.setVerticalGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(por)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pf.setText("PF");
        pf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf(evt);
                //System.out.println(evt);
            }
        });

        cocomo1.setText("Cocomo 1");
        cocomo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cocomo1(evt);
            }
        });

        cocomo2.setText("Cocomo 2");
        cocomo2.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cocomo2(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 42, Short.MAX_VALUE)
                        .addComponent(pf)
                        .addGap(18, 18, 18)
                        .addComponent(cocomo1)
                        .addGap(18, 18, 18)
                        .addComponent(cocomo2)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pf)
                    .addComponent(cocomo1)
                    .addComponent(cocomo2))
                .addContainerGap())
        );
        frame.setVisible(true);
    }
    public void pf(java.awt.event.ActionEvent evt){
        JFrame puntos_de=new JFrame();
        Titulo = new javax.swing.JLabel();
        otro = new javax.swing.JTextField();
        parametros = new javax.swing.JLabel();
        complejidad = new javax.swing.JLabel();
        significativos = new javax.swing.JLabel();
        baja = new javax.swing.JLabel();
        media = new javax.swing.JLabel();
        alta = new javax.swing.JLabel();
        entradas = new javax.swing.JLabel();
        salidad = new javax.swing.JLabel();
        archivos_l = new javax.swing.JLabel();
        archivos_i = new javax.swing.JLabel();
        consultas = new javax.swing.JLabel();
        panel_co = new javax.swing.JPanel();
        e_b = new javax.swing.JTextField();
        s_b = new javax.swing.JTextField();
        l_b = new javax.swing.JTextField();
        i_b = new javax.swing.JTextField();
        e_m = new javax.swing.JTextField();
        s_m = new javax.swing.JTextField();
        l_m = new javax.swing.JTextField();
        i_m = new javax.swing.JTextField();
        e_a = new javax.swing.JTextField();
        s_a = new javax.swing.JTextField();
        l_a = new javax.swing.JTextField();
        i_a = new javax.swing.JTextField();
        c_a = new javax.swing.JTextField();
        c_m = new javax.swing.JTextField();
        c_b = new javax.swing.JTextField();
        panel_leng = new javax.swing.JPanel();
        lenguaje_de = new javax.swing.JLabel();
        lenguaje = new javax.swing.JComboBox<>();
        panel_carac = new javax.swing.JPanel();
        caracteristicas = new javax.swing.JLabel();
        l_c1 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox<>();
        l_c2 = new javax.swing.JLabel();
        c2 = new javax.swing.JComboBox<>();
        l_c3 = new javax.swing.JLabel();
        c3 = new javax.swing.JComboBox<>();
        l_c4 = new javax.swing.JLabel();
        c4 = new javax.swing.JComboBox<>();
        l_c6 = new javax.swing.JLabel();
        c6 = new javax.swing.JComboBox<>();
        l_c7 = new javax.swing.JLabel();
        c7 = new javax.swing.JComboBox<>();
        l_c8 = new javax.swing.JLabel();
        c8 = new javax.swing.JComboBox<>();
        l_c9 = new javax.swing.JLabel();
        c9 = new javax.swing.JComboBox<>();
        l_c5 = new javax.swing.JLabel();
        c5 = new javax.swing.JComboBox<>();
        l_c10 = new javax.swing.JLabel();
        c10 = new javax.swing.JComboBox<>();
        l_c15 = new javax.swing.JLabel();
        c14 = new javax.swing.JComboBox<>();
        l_c14 = new javax.swing.JLabel();
        c13 = new javax.swing.JComboBox<>();
        l_c13 = new javax.swing.JLabel();
        l_c12 = new javax.swing.JLabel();
        c12 = new javax.swing.JComboBox<>();
        c11 = new javax.swing.JComboBox<>();
        l_c11 = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        panel_result = new javax.swing.JPanel();
        result = new javax.swing.JLabel();
        pf_s = new javax.swing.JLabel();
        pfs = new javax.swing.JTextField();
        puntos_aj = new javax.swing.JLabel();
        fc = new javax.swing.JTextField();
        factor_c = new javax.swing.JLabel();
        pfa = new javax.swing.JTextField();
        lines = new javax.swing.JLabel();
        miles = new javax.swing.JLabel();
        volver=new JButton();
        puntos_de.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        puntos_de.setBounds(0, 0, 459, 650);
        puntos_de.setLocationRelativeTo(null);
        Titulo.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        Titulo.setText("Puntos de Función");
        volver.setText("< Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frame.setVisible(true);
                puntos_de.setVisible(false);
            }
        });
        
        parametros.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        parametros.setText("Parametros");

        complejidad.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        complejidad.setText("Complejidad");

        significativos.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        significativos.setText("Significativos");

        baja.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        baja.setText("Baja");

        media.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        media.setText("Media");

        alta.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        alta.setText("Alta");

        entradas.setText("Entradas externas");

        salidad.setText("Salidas externas");

        archivos_l.setText("Archivos lógicos");

        archivos_i.setText("Archivos de interfaz");

        consultas.setText("Consultas");

        e_b.setText("0");
        //calcular
        e_b.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        e_m.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        e_a.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        s_b.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        s_m.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        s_a.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        l_b.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        l_m.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        l_a.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        i_b.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        i_m.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        i_a.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        c_b.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        c_m.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        c_a.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        s_b.setText("0");

        l_b.setText("0");

        i_b.setText("0");

        e_m.setText("0");
        e_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //e_mActionPerformed(evt);
            }
        });

        s_m.setText("0");

        l_m.setText("0");

        i_m.setText("0");

        e_a.setText("0");
        e_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //e_aActionPerformed(evt);
            }
        });

        s_a.setText("0");

        l_a.setText("0");

        i_a.setText("0");

        c_a.setText("0");

        c_m.setText("0");

        c_b.setText("0");

        javax.swing.GroupLayout panel_coLayout = new javax.swing.GroupLayout(panel_co);
        panel_co.setLayout(panel_coLayout);
        panel_coLayout.setHorizontalGroup(
            panel_coLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_coLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_coLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c_b, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(i_b, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_b)
                    .addComponent(e_b)
                    .addComponent(s_b))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_coLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c_m, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(i_m, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_m)
                    .addComponent(e_m)
                    .addComponent(s_m))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_coLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_coLayout.createSequentialGroup()
                        .addGroup(panel_coLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(i_a)
                            .addComponent(l_a, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(e_a, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s_a, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(c_a))
                .addContainerGap())
        );
        panel_coLayout.setVerticalGroup(
            panel_coLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_coLayout.createSequentialGroup()
                .addGroup(panel_coLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_coLayout.createSequentialGroup()
                        .addComponent(e_b, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(s_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(i_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_coLayout.createSequentialGroup()
                        .addComponent(e_m, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(s_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(i_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_coLayout.createSequentialGroup()
                        .addComponent(e_a, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(s_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(i_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_coLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_coLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(c_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        lenguaje_de.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lenguaje_de.setText("Lenguaje de Programación");

        lenguaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4GL", "Ada 83", "Ada 95", "APL", "BASIC - compilado","BASIC - interpretado", "BASIC ANSI/Quick/Turbo", "C","C++", "Cobol ANSI 85","Delphi 1","Ensamblador","Ensamblador (Macro)","Forth","Fortran 77","FoxPro 2.5","Generador de informes","Hoja de calculo","Java","Modula 2","Oracle","Oracle 2000","Paradox","Pascal","Pacal Turbo 5","Power Builder","Prolog","Visual Basic 3","Visual C++","Visual Cobol","Otro"}));
        lenguaje.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lenguaje.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                //lenguajeItemStateChanged(evt);
            }
        });
        lenguaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //lenguajeActionPerformed(evt);
            }
        });
        lenguaje.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                if(String.valueOf(lenguaje.getSelectedItem()).equalsIgnoreCase("Otro")){
                    otro.setEditable(true);
                }
                puntos_de_funcion();
            }
        });
        otro.setEditable(false);
        otro.setText("0.0");
        otro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        javax.swing.GroupLayout panel_lengLayout = new javax.swing.GroupLayout(panel_leng);
        panel_leng.setLayout(panel_lengLayout);
        panel_lengLayout.setHorizontalGroup(
            panel_lengLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_lengLayout.createSequentialGroup()
                .addGroup(panel_lengLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_lengLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(lenguaje_de))
                    .addGroup(panel_lengLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lenguaje, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(otro, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
        );
        panel_lengLayout.setVerticalGroup(
            panel_lengLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_lengLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lenguaje_de)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_lengLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lenguaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(otro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        caracteristicas.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        caracteristicas.setText("Caracteristicas");

        l_c1.setText("C1");

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", " " }));
        c1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                //c1ItemStateChanged(evt);
            }
        });
        

        l_c2.setText("C2");

        c2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", " " }));

        l_c3.setText("C3");

        c3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", " " }));

        l_c4.setText("C4");

        c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", " " }));

        l_c6.setText("C6");

        c6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", " " }));

        l_c7.setText("C7");

        c7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", " " }));

        l_c8.setText("C8");

        c8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", " " }));

        l_c9.setText("C9");

        c9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", " " }));

        l_c5.setText("C5");

        c5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", " " }));

        l_c10.setText("C10");

        c10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", " " }));


        l_c15.setText("C15");

        c14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", " " }));

        l_c14.setText("C14");

        c13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", " " }));

        l_c13.setText("C13");

        l_c12.setText("C12");

        c12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", " " }));

        c11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", " " }));

        l_c11.setText("C11");
        c1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        c2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        c3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        c4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        c5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        c6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        c6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        c7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        c8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        c9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        c10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        c11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        c12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        c13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        c14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                puntos_de_funcion();
            }
        });
        javax.swing.GroupLayout panel_caracLayout = new javax.swing.GroupLayout(panel_carac);
        panel_carac.setLayout(panel_caracLayout);
        panel_caracLayout.setHorizontalGroup(
            panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_caracLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_caracLayout.createSequentialGroup()
                        .addComponent(caracteristicas)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_caracLayout.createSequentialGroup()
                        .addGroup(panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_caracLayout.createSequentialGroup()
                                .addComponent(l_c4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l_c9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panel_caracLayout.createSequentialGroup()
                                    .addGroup(panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel_caracLayout.createSequentialGroup()
                                            .addComponent(l_c2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel_caracLayout.createSequentialGroup()
                                            .addComponent(l_c3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel_caracLayout.createSequentialGroup()
                                            .addGap(26, 26, 26)
                                            .addComponent(l_c8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_caracLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(l_c7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(panel_caracLayout.createSequentialGroup()
                                    .addComponent(l_c1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(l_c6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_caracLayout.createSequentialGroup()
                                .addComponent(l_c5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l_c10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_caracLayout.createSequentialGroup()
                                .addComponent(l_c14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_caracLayout.createSequentialGroup()
                                        .addComponent(l_c13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_caracLayout.createSequentialGroup()
                                        .addComponent(l_c12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panel_caracLayout.createSequentialGroup()
                                    .addComponent(l_c11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(61, 61, 61))))
        );
        panel_caracLayout.setVerticalGroup(
            panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_caracLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caracteristicas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_caracLayout.createSequentialGroup()
                        .addGroup(panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_c1)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_c6)
                            .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_caracLayout.createSequentialGroup()
                                .addGroup(panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(l_c2)
                                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(l_c3)
                                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_caracLayout.createSequentialGroup()
                                .addGroup(panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(l_c7)
                                    .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(l_c8)
                                    .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_c4)
                            .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_c9)
                            .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_c5)
                            .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_c10)))
                    .addGroup(panel_caracLayout.createSequentialGroup()
                        .addGroup(panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_c11)
                            .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_c12)
                            .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_c13)
                            .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_caracLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_c14)
                            .addComponent(c14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        result.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        result.setText("Resultados");

        pf_s.setText("Puntos de Función Sin Ajustar");

        pfs.setText("0.0");
        pfs.setEnabled(false);

        puntos_aj.setText("Puntos de Función Ajustados");

        fc.setText("0.0");
        fc.setEnabled(false);

        factor_c.setText("Factor de Complejidad");

        pfa.setText("0.0");
        pfa.setEnabled(false);

        lines.setText("LDC - Lineas de código");

        ldc.setText("0.0");
        ldc.setEnabled(false);

        miles.setText("KLDC - Miles de lineas de código");

        kldc.setText("0.0");
        kldc.setEnabled(false);

        javax.swing.GroupLayout panel_resultLayout = new javax.swing.GroupLayout(panel_result);
        panel_result.setLayout(panel_resultLayout);
        panel_resultLayout.setHorizontalGroup(
            panel_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_resultLayout.createSequentialGroup()
                .addGroup(panel_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_resultLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(result)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_resultLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panel_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_resultLayout.createSequentialGroup()
                                .addComponent(miles)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(kldc, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_resultLayout.createSequentialGroup()
                                .addComponent(lines)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ldc, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_resultLayout.createSequentialGroup()
                                .addComponent(puntos_aj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pfa, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_resultLayout.createSequentialGroup()
                                .addComponent(factor_c)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fc, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_resultLayout.createSequentialGroup()
                                .addComponent(pf_s)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pfs, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panel_resultLayout.setVerticalGroup(
            panel_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_resultLayout.createSequentialGroup()
                .addComponent(result)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pf_s)
                    .addComponent(pfs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(factor_c))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puntos_aj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ldc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lines))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kldc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(miles))
                .addGap(50, 50, 50))
        );

        scroll.setViewportView(panel_result);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(puntos_de.getContentPane());
        puntos_de.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(126, 126, 126))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_carac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_leng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(parametros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(complejidad)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(significativos)
                            .addComponent(consultas)
                            .addComponent(archivos_i)
                            .addComponent(entradas)
                            .addComponent(archivos_l)
                            .addComponent(salidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_co, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(baja)
                                .addGap(40, 40, 40)
                                .addComponent(media)
                                .addGap(29, 29, 29)
                                .addComponent(alta)
                                .addGap(21, 21, 21))))))
        .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Titulo)
                        .addGap(23, 23, 23)
                        .addComponent(volver))
                    .addComponent(panel_carac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scroll))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo)
                    .addComponent(volver))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parametros)
                    .addComponent(complejidad))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(significativos)
                    .addComponent(baja)
                    .addComponent(media)
                    .addComponent(alta))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(entradas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salidad)
                        .addGap(18, 18, 18)
                        .addComponent(archivos_l)
                        .addGap(20, 20, 20)
                        .addComponent(archivos_i)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consultas))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_co, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(panel_leng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(panel_carac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        frame.setVisible(false);
        
        puntos_de.setVisible(true);
    }
    public void cocomo1(java.awt.event.ActionEvent evt){
        JFrame com_frame=new JFrame();
        com_frame.setBounds(0, 0, 690, 400);
        com_frame.setLocationRelativeTo(null);
        acap = new javax.swing.ButtonGroup();
        aexp = new javax.swing.ButtonGroup();
        cplx = new javax.swing.ButtonGroup();
        data = new javax.swing.ButtonGroup();
        lexp = new javax.swing.ButtonGroup();
        modp = new javax.swing.ButtonGroup();
        pcap = new javax.swing.ButtonGroup();
        rely = new javax.swing.ButtonGroup();
        sced = new javax.swing.ButtonGroup();
        stor = new javax.swing.ButtonGroup();
        time = new javax.swing.ButtonGroup();
        tool = new javax.swing.ButtonGroup();
        turn = new javax.swing.ButtonGroup();
        vexp = new javax.swing.ButtonGroup();
        virt = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        l_nivel = new javax.swing.JLabel();
        l_modo = new javax.swing.JLabel();
        nivel = new javax.swing.JComboBox<>();
        modo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        manejado_la = new javax.swing.JLabel();
        vl_l = new javax.swing.JLabel();
        l_l = new javax.swing.JLabel();
        n_l = new javax.swing.JLabel();
        h_l = new javax.swing.JLabel();
        v_h_l = new javax.swing.JLabel();
        e_h_l = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jRadioButton39 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton40 = new javax.swing.JRadioButton();
        jRadioButton41 = new javax.swing.JRadioButton();
        jRadioButton42 = new javax.swing.JRadioButton();
        jRadioButton43 = new javax.swing.JRadioButton();
        jRadioButton44 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton45 = new javax.swing.JRadioButton();
        jRadioButton46 = new javax.swing.JRadioButton();
        jRadioButton47 = new javax.swing.JRadioButton();
        jRadioButton48 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton49 = new javax.swing.JRadioButton();
        jRadioButton50 = new javax.swing.JRadioButton();
        jRadioButton51 = new javax.swing.JRadioButton();
        jRadioButton52 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton53 = new javax.swing.JRadioButton();
        jRadioButton54 = new javax.swing.JRadioButton();
        jRadioButton55 = new javax.swing.JRadioButton();
        jRadioButton56 = new javax.swing.JRadioButton();
        jRadioButton57 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton58 = new javax.swing.JRadioButton();
        jRadioButton59 = new javax.swing.JRadioButton();
        jRadioButton60 = new javax.swing.JRadioButton();
        jRadioButton61 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton62 = new javax.swing.JRadioButton();
        jRadioButton63 = new javax.swing.JRadioButton();
        jRadioButton64 = new javax.swing.JRadioButton();
        jRadioButton65 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jRadioButton66 = new javax.swing.JRadioButton();
        jRadioButton67 = new javax.swing.JRadioButton();
        jRadioButton68 = new javax.swing.JRadioButton();
        jRadioButton69 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        e = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        t = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        pr = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        p = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        costo = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        costo_total = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();

        com_frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        titulo.setText("Cocomo 1");

        volver.setText("< Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_frame.setVisible(false);
                frame.setVisible(true);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(129, 129, 129)
                .addComponent(volver)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo)
                    .addComponent(volver)))
        );

        l_nivel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        l_nivel.setText("Nivel");

        l_modo.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        l_modo.setText("Modo");

        nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Básico", "Intermedio" }));

        modo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Orgánico", "Semi-acoplado", "Empotrado" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_nivel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(l_modo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_nivel)
                    .addComponent(l_modo)
                    .addComponent(nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        manejado_la.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        manejado_la.setText("Manejadores de Costo");

        vl_l.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        vl_l.setText("Very Low");

        l_l.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        l_l.setText("Low");

        n_l.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        n_l.setText("Nominal");

        h_l.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        h_l.setText("High");

        v_h_l.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        v_h_l.setText("Very High");

        e_h_l.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        e_h_l.setText("Extra High");

        jLabel11.setText("ACAP");

        acap.add(jRadioButton1);
        jRadioButton1.setText("1.46");
        jRadioButton1.setActionCommand("1.46");

        acap.add(jRadioButton2);
        jRadioButton2.setText("1.19");
        jRadioButton2.setActionCommand("1.19");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jRadioButton2ActionPerformed(evt);
            }
        });

        acap.add(jRadioButton3);
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("1.00");
        jRadioButton3.setToolTipText("1.00");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jRadioButton3ActionPerformed(evt);
            }
        });

        acap.add(jRadioButton4);
        jRadioButton4.setText("0.86");
        jRadioButton4.setActionCommand("0.86");

        acap.add(jRadioButton5);
        jRadioButton5.setText("0.71");
        jRadioButton5.setActionCommand("0.71");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jRadioButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("AEXP");

        aexp.add(jRadioButton6);
        jRadioButton6.setText("1.29");
        jRadioButton6.setActionCommand("1.29");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jRadioButton6ActionPerformed(evt);
            }
        });

        aexp.add(jRadioButton7);
        jRadioButton7.setText("1.13");
        jRadioButton7.setActionCommand("1.13");

        aexp.add(jRadioButton8);
        jRadioButton8.setSelected(true);
        jRadioButton8.setText("1.00");
        jRadioButton8.setActionCommand("1.00");

        aexp.add(jRadioButton9);
        jRadioButton9.setText("0.91");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jRadioButton9ActionPerformed(evt);
            }
        });

        aexp.add(jRadioButton10);
        jRadioButton10.setText("0.82");

        jLabel2.setText("CPLX");

        cplx.add(jRadioButton11);
        jRadioButton11.setText("0.70");

        cplx.add(jRadioButton12);
        jRadioButton12.setText("0.85");

        cplx.add(jRadioButton13);
        jRadioButton13.setSelected(true);
        jRadioButton13.setText("1.00");

        cplx.add(jRadioButton14);
        jRadioButton14.setText("1.15");

        cplx.add(jRadioButton15);
        jRadioButton15.setText("1.30");
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jRadioButton15ActionPerformed(evt);
            }
        });

        cplx.add(jRadioButton16);
        jRadioButton16.setText("1.65");

        jLabel3.setText("DATA");

        data.add(jRadioButton17);
        jRadioButton17.setText("0.94");

        data.add(jRadioButton18);
        jRadioButton18.setSelected(true);
        jRadioButton18.setText("1.00");

        data.add(jRadioButton19);
        jRadioButton19.setText("1.08");

        data.add(jRadioButton20);
        jRadioButton20.setText("1.16");

        jLabel4.setText("LEXP");

        lexp.add(jRadioButton21);
        jRadioButton21.setText("1.14");

        lexp.add(jRadioButton22);
        jRadioButton22.setText("1.07");

        lexp.add(jRadioButton23);
        jRadioButton23.setSelected(true);
        jRadioButton23.setText("1.00");

        lexp.add(jRadioButton24);
        jRadioButton24.setText("0.95");
        jRadioButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jRadioButton24ActionPerformed(evt);
            }
        });

        jLabel5.setText("MODP");

        modp.add(jRadioButton25);
        jRadioButton25.setText("1.24");

        modp.add(jRadioButton26);
        jRadioButton26.setText("1.10");

        modp.add(jRadioButton27);
        jRadioButton27.setSelected(true);
        jRadioButton27.setText("1.00");

        modp.add(jRadioButton28);
        jRadioButton28.setText("0.91");

        modp.add(jRadioButton29);
        jRadioButton29.setText("0.82");

        jLabel6.setText("PCAP");

        pcap.add(jRadioButton30);
        jRadioButton30.setText("1.42");

        pcap.add(jRadioButton31);
        jRadioButton31.setText("1.17");

        pcap.add(jRadioButton32);
        jRadioButton32.setSelected(true);
        jRadioButton32.setText("1.00");

        pcap.add(jRadioButton33);
        jRadioButton33.setText("0.86");

        pcap.add(jRadioButton34);
        jRadioButton34.setText("0.70");

        jLabel7.setText("RELY");

        rely.add(jRadioButton35);
        jRadioButton35.setText("0.75");
        jRadioButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jRadioButton35ActionPerformed(evt);
            }
        });

        rely.add(jRadioButton36);
        jRadioButton36.setText("0.88");

        rely.add(jRadioButton37);
        jRadioButton37.setSelected(true);
        jRadioButton37.setText("1.00");

        rely.add(jRadioButton38);
        jRadioButton38.setText("1.15");

        rely.add(jRadioButton39);
        jRadioButton39.setText("1.40");

        jLabel8.setText("SCED");

        sced.add(jRadioButton40);
        jRadioButton40.setText("1.23");

        sced.add(jRadioButton41);
        jRadioButton41.setText("1.08");

        sced.add(jRadioButton42);
        jRadioButton42.setSelected(true);
        jRadioButton42.setText("1.00");

        sced.add(jRadioButton43);
        jRadioButton43.setText("1.04");

        sced.add(jRadioButton44);
        jRadioButton44.setText("1.10");

        jLabel9.setText("STOR");

        stor.add(jRadioButton45);
        jRadioButton45.setSelected(true);
        jRadioButton45.setText("1.00");

        stor.add(jRadioButton46);
        jRadioButton46.setText("1.06");

        stor.add(jRadioButton47);
        jRadioButton47.setText("1.21");

        stor.add(jRadioButton48);
        jRadioButton48.setText("1.56");

        jLabel10.setText("TIME");

        time.add(jRadioButton49);
        jRadioButton49.setSelected(true);
        jRadioButton49.setText("1.00");

        time.add(jRadioButton50);
        jRadioButton50.setText("1.11");

        time.add(jRadioButton51);
        jRadioButton51.setText("1.30");
        jRadioButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jRadioButton51ActionPerformed(evt);
            }
        });

        time.add(jRadioButton52);
        jRadioButton52.setText("1.66");

        jLabel12.setText("TOOL");

        tool.add(jRadioButton53);
        jRadioButton53.setText("1.24");

        tool.add(jRadioButton54);
        jRadioButton54.setText("1.10");

        tool.add(jRadioButton55);
        jRadioButton55.setSelected(true);
        jRadioButton55.setText("1.00");

        tool.add(jRadioButton56);
        jRadioButton56.setText("0.91");

        tool.add(jRadioButton57);
        jRadioButton57.setText("0.83");

        jLabel13.setText("TURN");

        turn.add(jRadioButton58);
        jRadioButton58.setText("0.87");

        turn.add(jRadioButton59);
        jRadioButton59.setSelected(true);
        jRadioButton59.setText("1.00");

        turn.add(jRadioButton60);
        jRadioButton60.setText("1.07");

        turn.add(jRadioButton61);
        jRadioButton61.setText("1.15");

        jLabel14.setText("VEXP");

        vexp.add(jRadioButton62);
        jRadioButton62.setText("1.21");

        vexp.add(jRadioButton63);
        jRadioButton63.setText("1.10");

        vexp.add(jRadioButton64);
        jRadioButton64.setSelected(true);
        jRadioButton64.setText("1.00");
        jRadioButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jRadioButton64ActionPerformed(evt);
            }
        });

        vexp.add(jRadioButton65);
        jRadioButton65.setText("0.90");

        jLabel15.setText("VIRT");

        virt.add(jRadioButton66);
        jRadioButton66.setText("0.87");

        virt.add(jRadioButton67);
        jRadioButton67.setSelected(true);
        jRadioButton67.setText("1.00");
        jRadioButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jRadioButton67ActionPerformed(evt);
            }
        });

        virt.add(jRadioButton68);
        jRadioButton68.setText("1.15");

        virt.add(jRadioButton69);
        jRadioButton69.setText("1.30");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manejado_la)
                            .addComponent(jLabel11)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton39))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton32)
                                .addGap(12, 12, 12)
                                .addComponent(jRadioButton33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton34))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton29))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButton17)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jRadioButton11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton12)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jRadioButton13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton16))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jRadioButton18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton20))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton24))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jRadioButton40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton42))
                                    .addComponent(jRadioButton45))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jRadioButton43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton44))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jRadioButton46)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton48))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jRadioButton49)
                                .addGap(12, 12, 12)
                                .addComponent(jRadioButton50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton52))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jRadioButton1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jRadioButton2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jRadioButton3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jRadioButton4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(vl_l)
                                            .addGap(18, 18, 18)
                                            .addComponent(l_l)
                                            .addGap(30, 30, 30)
                                            .addComponent(n_l)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(h_l)
                                            .addGap(19, 19, 19)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jRadioButton6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton9)
                                        .addGap(2, 2, 2)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton10)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(v_h_l)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(e_h_l))
                                    .addComponent(jRadioButton5)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton57))))
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(161, 161, 161)
                                .addComponent(jRadioButton62))
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton66)
                                .addGap(78, 78, 78)
                                .addComponent(jRadioButton68)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton69))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jRadioButton58)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton59))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jRadioButton63)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton64)
                                            .addComponent(jRadioButton67, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jRadioButton60)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton61))
                                    .addComponent(jRadioButton65))))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manejado_la)
                    .addComponent(vl_l)
                    .addComponent(l_l)
                    .addComponent(n_l)
                    .addComponent(h_l)
                    .addComponent(v_h_l)
                    .addComponent(e_h_l))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton12)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton14)
                    .addComponent(jRadioButton15)
                    .addComponent(jRadioButton16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButton17)
                    .addComponent(jRadioButton18)
                    .addComponent(jRadioButton19)
                    .addComponent(jRadioButton20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton21)
                    .addComponent(jRadioButton22)
                    .addComponent(jRadioButton23)
                    .addComponent(jRadioButton24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButton25)
                    .addComponent(jRadioButton26)
                    .addComponent(jRadioButton27)
                    .addComponent(jRadioButton28)
                    .addComponent(jRadioButton29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton30)
                    .addComponent(jRadioButton31)
                    .addComponent(jRadioButton32)
                    .addComponent(jRadioButton33)
                    .addComponent(jRadioButton34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButton35)
                    .addComponent(jRadioButton36)
                    .addComponent(jRadioButton37)
                    .addComponent(jRadioButton38)
                    .addComponent(jRadioButton39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jRadioButton40)
                    .addComponent(jRadioButton41)
                    .addComponent(jRadioButton42)
                    .addComponent(jRadioButton43)
                    .addComponent(jRadioButton44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jRadioButton45)
                    .addComponent(jRadioButton46)
                    .addComponent(jRadioButton47)
                    .addComponent(jRadioButton48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jRadioButton49)
                    .addComponent(jRadioButton50)
                    .addComponent(jRadioButton51)
                    .addComponent(jRadioButton52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jRadioButton53)
                    .addComponent(jRadioButton54)
                    .addComponent(jRadioButton55)
                    .addComponent(jRadioButton56)
                    .addComponent(jRadioButton57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jRadioButton58)
                    .addComponent(jRadioButton59)
                    .addComponent(jRadioButton60)
                    .addComponent(jRadioButton61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jRadioButton62)
                            .addComponent(jRadioButton63))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jRadioButton66)
                            .addComponent(jRadioButton68)
                            .addComponent(jRadioButton69)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton64)
                            .addComponent(jRadioButton65))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton67)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel3);

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel16.setText("Resultados");

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel17.setText("LDC");

        ldc.setText("0.0");

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel18.setText("KLDC");

        kldc.setText("0.0");

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel19.setText("Esfuerzo");

        e.setText("0.0");

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel20.setText("Mes-Hombre");

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel21.setText("Tiempo");

        t.setText("0.0");

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel22.setText("Meses");

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel23.setText("PR");

        pr.setText("0.0");

        jLabel24.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel24.setText("P");

        p.setText("0.0");

        jLabel25.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel25.setText("Costo");

        costo.setText("0.0");

        jLabel26.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel26.setText("Costo Total");

        costo_total.setText("0.0");

        calcular.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcular_cocomo();
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(276, 276, 276))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(ldc, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel21)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t)
                            .addComponent(pr)
                            .addComponent(p)
                            .addComponent(e, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(calcular)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel26))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(kldc, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(jLabel25)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(costo)
                                .addComponent(costo_total, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(ldc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(kldc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel26)
                    .addComponent(costo_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(pr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcular))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(com_frame.getContentPane());
        com_frame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        com_frame.setVisible(true);
        jRadioButton3.setToolTipText("1.00");
        System.out.print(acap.getSelection().getActionCommand());
    }
    public void cocomo2(java.awt.event.ActionEvent evt){
        
    }
    public void puntos_de_funcion(){
        int p_s=0;
        double factor_complejidad=0;
        p_s+=Integer.parseInt(e_b.getText())*3;
        p_s+=Integer.parseInt(e_m.getText())*4;
        p_s+=Integer.parseInt(e_a.getText())*6;
        p_s+=Integer.parseInt(s_b.getText())*4;
        p_s+=Integer.parseInt(s_m.getText())*5;
        p_s+=Integer.parseInt(s_a.getText())*7;
        p_s+=Integer.parseInt(l_b.getText())*7;
        p_s+=Integer.parseInt(l_m.getText())*10;
        p_s+=Integer.parseInt(l_a.getText())*15;
        p_s+=Integer.parseInt(i_b.getText())*5;
        p_s+=Integer.parseInt(i_m.getText())*7;
        p_s+=Integer.parseInt(i_a.getText())*10;
        p_s+=Integer.parseInt(c_b.getText())*3;
        p_s+=Integer.parseInt(c_m.getText())*4;
        p_s+=Integer.parseInt(c_a.getText())*6;
        pfs.setText(String.valueOf(p_s));
        //calculo de factores
        factor_complejidad+=Double.parseDouble(String.valueOf(c1.getSelectedItem()));
        factor_complejidad+=Double.parseDouble(String.valueOf(c2.getSelectedItem()));
        factor_complejidad+=Double.parseDouble(String.valueOf(c3.getSelectedItem()));
        factor_complejidad+=Double.parseDouble(String.valueOf(c4.getSelectedItem()));
        factor_complejidad+=Double.parseDouble(String.valueOf(c5.getSelectedItem()));
        factor_complejidad+=Double.parseDouble(String.valueOf(c6.getSelectedItem()));
        factor_complejidad+=Double.parseDouble(String.valueOf(c7.getSelectedItem()));
        factor_complejidad+=Double.parseDouble(String.valueOf(c8.getSelectedItem()));
        factor_complejidad+=Double.parseDouble(String.valueOf(c9.getSelectedItem()));
        factor_complejidad+=Double.parseDouble(String.valueOf(c10.getSelectedItem()));
        factor_complejidad+=Double.parseDouble(String.valueOf(c11.getSelectedItem()));
        factor_complejidad+=Double.parseDouble(String.valueOf(c12.getSelectedItem()));
        factor_complejidad+=Double.parseDouble(String.valueOf(c13.getSelectedItem()));
        factor_complejidad+=Double.parseDouble(String.valueOf(c14.getSelectedItem()));
        factor_complejidad=factor_complejidad*0.01+0.65;
        fc.setText(String.valueOf(factor_complejidad));
        pfa.setText(String.valueOf(factor_complejidad*(double)p_s));
        if(factor_complejidad==0.65)
            ldc.setText(String.valueOf(p_s*valores(String.valueOf(lenguaje.getSelectedItem()))));
        else
            ldc.setText(String.valueOf(factor_complejidad*(double)p_s*valores(String.valueOf(lenguaje.getSelectedItem()))));
        kldc.setText(String.valueOf(Double.parseDouble(ldc.getText())/1000));
    }
    private double valores(String valor){
        if(valor.equalsIgnoreCase("otro")){
            return Double.parseDouble(otro.getText());
            
        }
        else{
            switch(lenguaje.getSelectedIndex()){
                case 0:
                    return 40;
                case 1:
                    return 71;
                case 2:
                    return 49;
                case 3:
                    return 32;
                case 4:
                    return 91;
                case 5:
                    return 128;
                case 6:
                    return 64;
                case 7:
                    return 128;
                case 8:
                    return 29;
                case 9:
                    return 19;
                case 10:
                    return 91;
                case 11:
                    return 29;
                case 12:
                    return 320;
                case 13:
                    return 213;
                case 14: 
                    return 64;
                case 15:
                    return 105;
                case 16:
                    return 34;
                case 17:
                    return 80;
                case 18:
                    return 6;
                case 19:
                    return 53;
                case 20:
                    return 80;
                case 21:
                    return 40;
                case 22:
                    return 23;
                case 23:
                    return 36;
                case 24:
                    return 91;
                case 25:
                    return 49;
                case 26:
                    return 16;
                case 27:
                    return 64;
                case 28:
                    return 32;
                case 29:
                    return 34;
                case 30:
                    return 20;
                default:
                    return 0;
            }
        }    
    }
    public void calcular_cocomo(){
        double a,b,c,d,fa;
        DecimalFormat formato=new DecimalFormat("0.00");
        fa=0;
        if(String.valueOf(nivel.getSelectedItem()).equalsIgnoreCase("Básico")){//nivel basico
            if(String.valueOf(modo.getSelectedItem()).equalsIgnoreCase("Orgánico")){
                a=2.4;
                b=1.05;
                c=2.5;
                d=0.38;
            }
            else if(String.valueOf(modo.getSelectedItem()).equalsIgnoreCase("Semi-acoplado")){
                a=3.0;
                b=1.12;
                c=2.5;
                d=0.35;
            }
            else{
                a=3.6;
                b=1.2;
                c=2.5;
                d=0.32;
            }
        }
        else{
            if(String.valueOf(modo.getSelectedItem()).equalsIgnoreCase("Orgánico")){
                a=3.2;
                b=1.05;
                c=2.5;
                d=0.38;
            }
            else if(String.valueOf(modo.getSelectedItem()).equalsIgnoreCase("Semi-acoplado")){
                a=3.0;
                b=1.12;
                c=2.5;
                d=0.35;
            }
            else{
                a=2.8;
                b=1.2;
                c=2.5;
                d=0.32;
            }
        }
        fa=1.0;
        e.setText(String.valueOf(formato.format(a*Math.pow(Double.parseDouble(kldc.getText()),b)*fa)));
        t.setText(String.valueOf(formato.format(c*Math.pow(Double.parseDouble(e.getText()),d))));
        pr.setText(String.valueOf(formato.format(Double.parseDouble(ldc.getText())/Double.parseDouble(e.getText()))));
        p.setText(String.valueOf(formato.format(Double.parseDouble(e.getText())/Double.parseDouble(t.getText()))));
    }
}   
