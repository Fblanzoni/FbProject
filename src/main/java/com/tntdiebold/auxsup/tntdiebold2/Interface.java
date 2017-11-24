package com.tntdiebold.auxsup.tntdiebold2;

import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class Interface extends javax.swing.JFrame {

    //ManipuladorArquivo manipula = new ManipuladorArquivo();
    int contCampos;

    public Interface() {
        initComponents();
        this.setLocationRelativeTo(null);
        enter(txtSigla);
        enter(cboxIdTerminal);
        enter(txtNumLoja);
    }
    
    BuscaDados dado = new BuscaDados();
    

    // Metodo para deixar a tecla ENTER com o mesmo comportamento da tecla TAB
    public void enter(java.awt.Container frm) {
        HashSet conj = new HashSet(frm.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        conj.add(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0));
        frm.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);
    }

    // Metodo que limpa todos os campos do programa para nova utilização
    public void limpaCampos() {

        //Aba descrição Terminal
        txtSigla.setText(null);
        cboxIdTerminal.removeAllItems();
        txtNumSerie.setText(null);
        txtLoja.setText(null);
        txtNumLoja.setText(null);
        txtIp.setText(null);
        txtMascara.setText(null);
        txtGateway.setText(null);

        //Aba chamados
        txtNumChamado.setText(null);
        cboxChamado.setSelectedIndex(0);
        cboxOperador.setSelectedIndex(0);
        cboxContato.setSelectedIndex(0);
        cboxSolicitante.setSelectedIndex(0);
        cboxStatus.setSelectedIndex(0);
        cboxSolucaoChamado.setSelectedIndex(0);

    }

    
    public String[] getDadosTextFields(String[] temp, JFrame s){
        
        // Dados Loja
        temp[0] = txtSiglaAdd.getText();
        temp[1] = txtLojaAdd.getText();
        temp[2] = txtNumLojaAdd.getText();
        temp[3] = txtEnderecoAdd.getText();
        temp[4] = txtCidadeAdd.getText();
        temp[5] = txtBairroAdd.getText();
        temp[6] = txtEstadoAdd.getText();
        temp[7] = txtTelefoneAdd.getText();

        return temp;
        
    }
    
    //Metodo para procurar dados de TextBox
    
    int numTer = 0;
    
    public void preencherDados(JTextField campo, JComboBox comboBox){
                
        txtSigla.setText(Loja.retornoLojas.get(0).getSigla());
        txtLoja.setText(Loja.retornoLojas.get(0).getLoja());
        txtNumLoja.setText(Loja.retornoLojas.get(0).getNumLoja());
        txtEndereco.setText(Loja.retornoLojas.get(0).getEndereco());
        txtBairro.setText(Loja.retornoLojas.get(0).getBairro());
        txtCidade.setText(Loja.retornoLojas.get(0).getCidade());
        txtEstado.setText(Loja.retornoLojas.get(0).getEstado());
        txtTelefone.setText(Loja.retornoLojas.get(0).getTelefone());

        cboxIdTerminal.removeAllItems();        
        int qtdTer = Terminais.retornoTerminais.size();
        
        for(int i=0; i<qtdTer; i++){
            
            cboxIdTerminal.addItem(Terminais.retornoTerminais.get(i).getIdTerminal());

        }
                
        txtNumSerie.setText(Terminais.retornoTerminais.get(numTer).getNumSerie());
        txtEquipamentCode.setText(Terminais.retornoTerminais.get(numTer).getEquipamentCode());
        txtIp.setText(Terminais.retornoTerminais.get(numTer).getIp());
        txtMascara.setText(Terminais.retornoTerminais.get(numTer).getMascara());
        txtGateway.setText(Terminais.retornoTerminais.get(numTer).getGateway());
              
        cboxIdTerminal.setSelectedIndex(numTer);
        
    }
    
    
    public void formatText(String formato, JTextField teste, int PosCaret, KeyEvent evt){
               
        if(PosCaret >= formato.length()-1){
            teste.setText(teste.getText().substring(0, formato.length()-1));
        } else if(PosCaret <= formato.length()-1){
            if (formato.charAt(PosCaret) != '#'){
                System.out.println(formato.length());
                char s = formato.charAt(PosCaret);
                teste.replaceSelection(Character.toString(s));
            }
        }
        if(teste.getCaretPosition() == PosCaret-1 || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE){
            
            teste.setText(teste.getText().substring(0, PosCaret));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrameChamadosAbertos = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableChamadosAbertos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnSelecionarChamado = new javax.swing.JButton();
        jFrameLoja = new javax.swing.JFrame();
        jPanelLoja2 = new javax.swing.JPanel();
        lblNumLojaAdd = new javax.swing.JLabel();
        txtNumLojaAdd = new javax.swing.JTextField();
        lblLojaAdd = new javax.swing.JLabel();
        lblBairroAdd = new javax.swing.JLabel();
        txtBairroAdd = new javax.swing.JTextField();
        txtSiglaAdd = new javax.swing.JTextField();
        lblSiglaAdd = new javax.swing.JLabel();
        txtEnderecoAdd = new javax.swing.JTextField();
        lblEnderecoAdd = new javax.swing.JLabel();
        txtCidadeAdd = new javax.swing.JTextField();
        txtEstadoAdd = new javax.swing.JTextField();
        lblEstadoAdd = new javax.swing.JLabel();
        lblCidadeAdd = new javax.swing.JLabel();
        lblAddLoja = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        cboxClienteAdd = new javax.swing.JComboBox();
        lblClienteAdd = new javax.swing.JLabel();
        lblTelefoneAdd = new javax.swing.JLabel();
        txtLojaAdd = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnIncluirLoja = new javax.swing.JButton();
        txtTelefoneAdd = new javax.swing.JTextField(12);
        jPanelLogo = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jPanelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        PaneTerm = new javax.swing.JTabbedPane();
        jPanelTerminal = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblConfigRede = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        cboxIdTerminal = new javax.swing.JComboBox();
        lblIdTerminal = new javax.swing.JLabel();
        lblNumSerie = new javax.swing.JLabel();
        txtNumSerie = new javax.swing.JTextField();
        lblNumSerie1 = new javax.swing.JLabel();
        txtEquipamentCode = new javax.swing.JTextField();
        lblIp = new javax.swing.JLabel();
        txtIp = new javax.swing.JTextField();
        lblMascara = new javax.swing.JLabel();
        txtMascara = new javax.swing.JTextField();
        lblGateway = new javax.swing.JLabel();
        txtGateway = new javax.swing.JTextField();
        btnPing = new javax.swing.JButton();
        btnPing3 = new javax.swing.JButton();
        jPanelLoja = new javax.swing.JPanel();
        lblNumLoja = new javax.swing.JLabel();
        txtNumLoja = new javax.swing.JTextField();
        lblLoja = new javax.swing.JLabel();
        lblSigla1 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtSigla = new javax.swing.JTextField();
        lblSigla = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblSigla2 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        lblNumLoja2 = new javax.swing.JLabel();
        lblNumLoja1 = new javax.swing.JLabel();
        lblInfoLoja = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        cboxCliente = new javax.swing.JComboBox();
        lblCliente = new javax.swing.JLabel();
        lblNumLoja3 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        txtLoja = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        lblStatus3 = new javax.swing.JLabel();
        lblStatus5 = new javax.swing.JLabel();
        lblStatus6 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lblNumChamado8 = new javax.swing.JLabel();
        jPanelChamado = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtNumChamado2 = new javax.swing.JTextField();
        lblNumChamado3 = new javax.swing.JLabel();
        txtNumChamado3 = new javax.swing.JTextField();
        lblNumChamado = new javax.swing.JLabel();
        lblOperador = new javax.swing.JLabel();
        cboxOperador = new javax.swing.JComboBox();
        lblSolicitante = new javax.swing.JLabel();
        lblDetalhes = new javax.swing.JLabel();
        cboxChamado = new javax.swing.JComboBox();
        lblContato = new javax.swing.JLabel();
        cboxContato = new javax.swing.JComboBox();
        cboxSolicitante = new javax.swing.JComboBox();
        txtNumChamado = new javax.swing.JTextField();
        lblNumChamado1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblNumChamado2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lblNumChamado4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblStatusChamado = new javax.swing.JLabel();
        cboxStatus = new javax.swing.JComboBox();
        lblNumChamado5 = new javax.swing.JLabel();
        lblSolucaoChamado = new javax.swing.JLabel();
        txtNumChamado4 = new javax.swing.JTextField();
        lblNumChamado6 = new javax.swing.JLabel();
        txtNumChamado5 = new javax.swing.JTextField();
        cboxSolucaoChamado = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        lblStatus4 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lblNumChamado9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivos = new javax.swing.JMenu();
        jMenuDiretorioPlanilhas = new javax.swing.JMenuItem();
        jMenuTerminais = new javax.swing.JMenu();
        jMenuAddTerminal = new javax.swing.JMenuItem();
        jMenuEditTerminal = new javax.swing.JMenuItem();
        jMenuExcluirTerminal = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuExcluirTerminal1 = new javax.swing.JMenuItem();
        jMenuExcluirTerminal2 = new javax.swing.JMenuItem();
        jMenuExcluirTerminal3 = new javax.swing.JMenuItem();
        jMenuChamados = new javax.swing.JMenu();
        jMenuAbrirChamado = new javax.swing.JMenuItem();
        jMenuFecharChamado = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuEditarChamado = new javax.swing.JMenuItem();
        jMenuExcluirChamado = new javax.swing.JMenuItem();

        jFrameChamadosAbertos.setMinimumSize(new java.awt.Dimension(700, 280));
        jFrameChamadosAbertos.setName("Chamados em Aberto Pendentes"); // NOI18N
        jFrameChamadosAbertos.setResizable(false);
        jFrameChamadosAbertos.setSize(new java.awt.Dimension(1032, 288));
        jFrameChamadosAbertos.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrameChamadosAbertosWindowClosing(evt);
            }
        });

        tableChamadosAbertos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nº Chamado", "Descrição do Chamado ", "IdTerminal", "Operador", "Data Abert.", "Hora Abert.", "Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableChamadosAbertos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableChamadosAbertos);
        if (tableChamadosAbertos.getColumnModel().getColumnCount() > 0) {
            tableChamadosAbertos.getColumnModel().getColumn(0).setResizable(false);
            tableChamadosAbertos.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableChamadosAbertos.getColumnModel().getColumn(1).setResizable(false);
            tableChamadosAbertos.getColumnModel().getColumn(1).setPreferredWidth(230);
            tableChamadosAbertos.getColumnModel().getColumn(2).setResizable(false);
            tableChamadosAbertos.getColumnModel().getColumn(2).setPreferredWidth(40);
            tableChamadosAbertos.getColumnModel().getColumn(3).setResizable(false);
            tableChamadosAbertos.getColumnModel().getColumn(3).setPreferredWidth(45);
            tableChamadosAbertos.getColumnModel().getColumn(4).setResizable(false);
            tableChamadosAbertos.getColumnModel().getColumn(4).setPreferredWidth(40);
            tableChamadosAbertos.getColumnModel().getColumn(5).setResizable(false);
            tableChamadosAbertos.getColumnModel().getColumn(5).setPreferredWidth(40);
            tableChamadosAbertos.getColumnModel().getColumn(6).setResizable(false);
            tableChamadosAbertos.getColumnModel().getColumn(6).setPreferredWidth(40);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Chamados Abertos Pendentes");

        btnSelecionarChamado.setText("Selecionar Chamado");
        btnSelecionarChamado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSelecionarChamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelecionarChamadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jFrameChamadosAbertosLayout = new javax.swing.GroupLayout(jFrameChamadosAbertos.getContentPane());
        jFrameChamadosAbertos.getContentPane().setLayout(jFrameChamadosAbertosLayout);
        jFrameChamadosAbertosLayout.setHorizontalGroup(
            jFrameChamadosAbertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameChamadosAbertosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jFrameChamadosAbertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jFrameChamadosAbertosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSelecionarChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jFrameChamadosAbertosLayout.setVerticalGroup(
            jFrameChamadosAbertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameChamadosAbertosLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jFrameChamadosAbertosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnSelecionarChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jFrameLoja.setMinimumSize(new java.awt.Dimension(879, 260));
        jFrameLoja.setName("Adicionar Loja"); // NOI18N
        jFrameLoja.setResizable(false);
        jFrameLoja.setSize(new java.awt.Dimension(880, 280));

        jPanelLoja2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNumLojaAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblNumLojaAdd.setText("Nº Loja :");

        txtNumLojaAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNumLojaAdd.setName("Num. Loja"); // NOI18N
        txtNumLojaAdd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumLojaAddFocusLost(evt);
            }
        });
        txtNumLojaAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumLojaAddActionPerformed(evt);
            }
        });

        lblLojaAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblLojaAdd.setText("Loja    :");

        lblBairroAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblBairroAdd.setText("Bairro  :");
        lblBairroAdd.setName("Bairro"); // NOI18N

        txtBairroAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtBairroAdd.setName("Destrito"); // NOI18N

        txtSiglaAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtSiglaAdd.setName("Sigla"); // NOI18N
        txtSiglaAdd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSiglaAddFocusLost(evt);
            }
        });

        lblSiglaAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblSiglaAdd.setText("Sigla :");

        txtEnderecoAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtEnderecoAdd.setName("Endereço"); // NOI18N

        lblEnderecoAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblEnderecoAdd.setText("Endereço :");

        txtCidadeAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtCidadeAdd.setName("Cidade"); // NOI18N

        txtEstadoAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtEstadoAdd.setName("Estado"); // NOI18N

        lblEstadoAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblEstadoAdd.setText("Estado :");

        lblCidadeAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblCidadeAdd.setText("Cidade     :");

        lblAddLoja.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        lblAddLoja.setForeground(new java.awt.Color(153, 0, 0));
        lblAddLoja.setText("Preencha todos para adicionar a nova Loja :");

        cboxClienteAdd.setEditable(true);
        cboxClienteAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cboxClienteAdd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "ATACADÃO", "CARREFOUR" }));
        cboxClienteAdd.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxClienteAddItemStateChanged(evt);
            }
        });

        lblClienteAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblClienteAdd.setText("Cliente     :");

        lblTelefoneAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblTelefoneAdd.setText("Telefone :");

        txtLojaAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtLojaAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtLojaAdd.setName("Loja"); // NOI18N

        btnCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        btnIncluirLoja.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnIncluirLoja.setText("Incluir Loja");
        btnIncluirLoja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncluirLojaMouseClicked(evt);
            }
        });

        txtTelefoneAdd.setColumns(12);
        txtTelefoneAdd.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtTelefoneAdd.setName("Estado"); // NOI18N
        txtTelefoneAdd.setSelectionEnd(12);
        txtTelefoneAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefoneAddKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoja2Layout = new javax.swing.GroupLayout(jPanelLoja2);
        jPanelLoja2.setLayout(jPanelLoja2Layout);
        jPanelLoja2Layout.setHorizontalGroup(
            jPanelLoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoja2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelLoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator9)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLoja2Layout.createSequentialGroup()
                        .addComponent(lblAddLoja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIncluirLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLoja2Layout.createSequentialGroup()
                        .addGroup(jPanelLoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelLoja2Layout.createSequentialGroup()
                                .addComponent(lblCidadeAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCidadeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLoja2Layout.createSequentialGroup()
                                .addGroup(jPanelLoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEnderecoAdd)
                                    .addComponent(lblClienteAdd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelLoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelLoja2Layout.createSequentialGroup()
                                        .addComponent(cboxClienteAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblSiglaAdd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSiglaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblNumLojaAdd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNumLojaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEnderecoAdd))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstadoAdd)
                            .addComponent(lblBairroAdd)
                            .addComponent(lblLojaAdd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLoja2Layout.createSequentialGroup()
                                .addComponent(txtEstadoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblTelefoneAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefoneAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                            .addComponent(txtLojaAdd)
                            .addComponent(txtBairroAdd))))
                .addGap(30, 30, 30))
        );
        jPanelLoja2Layout.setVerticalGroup(
            jPanelLoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoja2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelLoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblAddLoja)
                    .addComponent(btnIncluirLoja)
                    .addComponent(btnCancelar))
                .addGap(12, 12, 12)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanelLoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblLojaAdd)
                    .addComponent(txtNumLojaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumLojaAdd)
                    .addComponent(txtSiglaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSiglaAdd)
                    .addComponent(cboxClienteAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClienteAdd)
                    .addComponent(txtLojaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelLoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtBairroAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairroAdd)
                    .addComponent(txtEnderecoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnderecoAdd))
                .addGap(30, 30, 30)
                .addGroup(jPanelLoja2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtEstadoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidadeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidadeAdd)
                    .addComponent(lblEstadoAdd)
                    .addComponent(lblTelefoneAdd)
                    .addComponent(txtTelefoneAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jFrameLojaLayout = new javax.swing.GroupLayout(jFrameLoja.getContentPane());
        jFrameLoja.getContentPane().setLayout(jFrameLojaLayout);
        jFrameLojaLayout.setHorizontalGroup(
            jFrameLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
            .addGroup(jFrameLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrameLojaLayout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jPanelLoja2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );
        jFrameLojaLayout.setVerticalGroup(
            jFrameLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
            .addGroup(jFrameLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrameLojaLayout.createSequentialGroup()
                    .addGap(0, 17, Short.MAX_VALUE)
                    .addComponent(jPanelLoja2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 17, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ferramenta Auxiliar TNT");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(962, 782));
        setResizable(false);
        setSize(new java.awt.Dimension(962, 792));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelLogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tntdiebold/auxtnt/arquivos_complementares/Imagens/logoDiebold.png"))); // NOI18N

        javax.swing.GroupLayout jPanelLogoLayout = new javax.swing.GroupLayout(jPanelLogo);
        jPanelLogo.setLayout(jPanelLogoLayout);
        jPanelLogoLayout.setHorizontalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(logo)
                .addGap(28, 28, 28))
        );
        jPanelLogoLayout.setVerticalGroup(
            jPanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelTitulo.setForeground(new java.awt.Color(204, 204, 204));

        lblTitulo.setFont(new java.awt.Font("Carlito", 1, 28)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 78, 167));
        lblTitulo.setText("FERRAMENTA AUXILIAR PARA SUPORTE");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblTitulo)
                .addGap(62, 62, 62))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        PaneTerm.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        jPanelTerminal.setEnabled(false);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblConfigRede.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        lblConfigRede.setForeground(new java.awt.Color(153, 0, 0));
        lblConfigRede.setText("Configurações para monitoração do Terminal");

        cboxIdTerminal.setEditable(true);
        cboxIdTerminal.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        cboxIdTerminal.setMaximumRowCount(10);
        cboxIdTerminal.setName("terminal.idTerminal"); // NOI18N
        cboxIdTerminal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxIdTerminalItemStateChanged(evt);
            }
        });
        cboxIdTerminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxIdTerminalActionPerformed(evt);
            }
        });

        lblIdTerminal.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblIdTerminal.setText("IDTerminal :");

        lblNumSerie.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblNumSerie.setText("Nº. Série :");

        txtNumSerie.setEditable(false);
        txtNumSerie.setBackground(new java.awt.Color(255, 255, 255));
        txtNumSerie.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNumSerie.setName("terminal.numSerie"); // NOI18N

        lblNumSerie1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblNumSerie1.setText("Modelo :");

        txtEquipamentCode.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtEquipamentCode.setName("terminal.equipamentCode"); // NOI18N

        lblIp.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblIp.setText("Ender. IP :");

        txtIp.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtIp.setName("terminal.ip"); // NOI18N

        lblMascara.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblMascara.setText("Mascara :");

        txtMascara.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtMascara.setName("terminal.mascara"); // NOI18N

        lblGateway.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblGateway.setText("Gateway :");

        txtGateway.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtGateway.setName("terminal.gateway"); // NOI18N

        btnPing.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnPing.setText("Comandos TNT");
        btnPing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPingMouseClicked(evt);
            }
        });

        btnPing3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnPing3.setText("Ping Terminal");
        btnPing3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPing3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblConfigRede)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPing3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnPing, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblIp)
                                .addGap(18, 18, 18)
                                .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblIdTerminal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboxIdTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMascara)
                            .addComponent(lblNumSerie))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumSerie, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtMascara))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGateway)
                            .addComponent(lblNumSerie1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEquipamentCode)
                            .addComponent(txtGateway))))
                .addGap(30, 30, 30))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConfigRede, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPing, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPing3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtEquipamentCode, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumSerie1)
                    .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumSerie)
                    .addComponent(cboxIdTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdTerminal))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtGateway, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGateway)
                    .addComponent(txtMascara, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMascara)
                    .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIp))
                .addGap(33, 33, 33))
        );

        jPanelLoja.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNumLoja.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblNumLoja.setText("Nº Loja :");

        txtNumLoja.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        txtNumLoja.setName("lojas.numLoja"); // NOI18N

        lblLoja.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblLoja.setText("Loja    :");

        lblSigla1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblSigla1.setText("Bairro  :");
        lblSigla1.setName("Bairro"); // NOI18N

        txtBairro.setEditable(false);
        txtBairro.setBackground(new java.awt.Color(255, 255, 255));
        txtBairro.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtBairro.setName("lojas.bairro"); // NOI18N

        txtSigla.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtSigla.setName("lojas.sigla"); // NOI18N
        txtSigla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSiglaFocusLost(evt);
            }
        });

        lblSigla.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblSigla.setText("Sigla :");

        txtEndereco.setEditable(false);
        txtEndereco.setBackground(new java.awt.Color(255, 255, 255));
        txtEndereco.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtEndereco.setName("lojas.endereco"); // NOI18N

        lblSigla2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblSigla2.setText("Endereço :");

        txtCidade.setEditable(false);
        txtCidade.setBackground(new java.awt.Color(255, 255, 255));
        txtCidade.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtCidade.setName("lojas.cidade"); // NOI18N

        txtEstado.setEditable(false);
        txtEstado.setBackground(new java.awt.Color(255, 255, 255));
        txtEstado.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtEstado.setName("lojas.estado"); // NOI18N

        lblNumLoja2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblNumLoja2.setText("Estado :");

        lblNumLoja1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblNumLoja1.setText("Cidade     :");

        lblInfoLoja.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        lblInfoLoja.setForeground(new java.awt.Color(153, 0, 0));
        lblInfoLoja.setText("Informações da loja do Terminal");

        cboxCliente.setEditable(true);
        cboxCliente.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cboxCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "ATACADÃO", "CARREFOUR" }));
        cboxCliente.setName("clientes.nomeFantasia"); // NOI18N
        cboxCliente.setNextFocusableComponent(txtSigla);

        lblCliente.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblCliente.setText("Cliente     :");

        lblNumLoja3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblNumLoja3.setText("Telefone :");

        txtTelefone.setEditable(false);
        txtTelefone.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefone.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtTelefone.setName("lojas.telefone"); // NOI18N

        txtLoja.setEditable(false);
        txtLoja.setBackground(new java.awt.Color(255, 255, 255));
        txtLoja.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtLoja.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtLoja.setName("lojas.loja"); // NOI18N

        javax.swing.GroupLayout jPanelLojaLayout = new javax.swing.GroupLayout(jPanelLoja);
        jPanelLoja.setLayout(jPanelLojaLayout);
        jPanelLojaLayout.setHorizontalGroup(
            jPanelLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLojaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator7)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLojaLayout.createSequentialGroup()
                        .addComponent(lblInfoLoja)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLojaLayout.createSequentialGroup()
                        .addGroup(jPanelLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelLojaLayout.createSequentialGroup()
                                .addComponent(lblNumLoja1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLojaLayout.createSequentialGroup()
                                .addGroup(jPanelLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSigla2)
                                    .addComponent(lblCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelLojaLayout.createSequentialGroup()
                                        .addComponent(cboxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblSigla)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblNumLoja)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNumLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEndereco))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumLoja2)
                            .addComponent(lblSigla1)
                            .addComponent(lblLoja))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLojaLayout.createSequentialGroup()
                                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblNumLoja3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefone))
                            .addComponent(txtLoja)
                            .addComponent(txtBairro))))
                .addGap(30, 30, 30))
        );
        jPanelLojaLayout.setVerticalGroup(
            jPanelLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLojaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblInfoLoja)
                .addGap(12, 12, 12)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanelLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblLoja)
                    .addComponent(txtNumLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumLoja)
                    .addComponent(txtSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSigla)
                    .addComponent(cboxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliente)
                    .addComponent(txtLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSigla1)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSigla2))
                .addGap(30, 30, 30)
                .addGroup(jPanelLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumLoja3)
                    .addComponent(lblNumLoja2)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumLoja1))
                .addGap(34, 34, 34))
        );

        txtSigla.getAccessibleContext().setAccessibleName("");

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblStatus3.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        lblStatus3.setText("                           Status Terminal 01000001 (");

        lblStatus5.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        lblStatus5.setForeground(new java.awt.Color(0, 153, 0));
        lblStatus5.setText("Online");

        lblStatus6.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        lblStatus6.setText(")");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(lblStatus3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus6)
                .addGap(0, 169, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblStatus5)
                    .addComponent(lblStatus3)
                    .addComponent(lblStatus6))
                .addGap(15, 15, 15))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNumChamado8.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        lblNumChamado8.setText("Status do chamado: Fechado ");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblNumChamado8)
                .addGap(63, 63, 63))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblNumChamado8)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanelTerminalLayout = new javax.swing.GroupLayout(jPanelTerminal);
        jPanelTerminal.setLayout(jPanelTerminalLayout);
        jPanelTerminalLayout.setHorizontalGroup(
            jPanelTerminalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTerminalLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanelTerminalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTerminalLayout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelLoja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        jPanelTerminalLayout.setVerticalGroup(
            jPanelTerminalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTerminalLayout.createSequentialGroup()
                .addComponent(jPanelLoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanelTerminalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        PaneTerm.addTab("Detalhes do Terminal", jPanelTerminal);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtNumChamado2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        lblNumChamado3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblNumChamado3.setText("Hora da abertura :");

        txtNumChamado3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        lblNumChamado.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblNumChamado.setText("Numero   :");

        lblOperador.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblOperador.setText("Operador :");

        cboxOperador.setEditable(true);
        cboxOperador.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cboxOperador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Alessandro", "Fábio", "Jhonatan" }));

        lblSolicitante.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblSolicitante.setText("Solicitante :");

        lblDetalhes.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblDetalhes.setText("Detalhes  :");

        cboxChamado.setEditable(true);
        cboxChamado.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cboxChamado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Captura de Log´s", "Reset nas máquinas", "Atividades de Distribuição e Instalação de Pacotes", "Acionamentos / Verificação de TAS´s (XMS / Facilities)", "Atualização de versão em campo", "Suporte para Técnicos em campo" }));

        lblContato.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblContato.setText("Contato :");

        cboxContato.setEditable(true);
        cboxContato.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cboxContato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Telefone", "Email", "Communicator" }));

        cboxSolicitante.setEditable(true);
        cboxSolicitante.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cboxSolicitante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Sergio (N1)", "Medeiros (N1)", "Gildo (N1)", "Daiana (XMS)", "Paulo (XMS)", "Lilian (CSF)", "Davi (Facilities)" }));

        txtNumChamado.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        lblNumChamado1.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        lblNumChamado1.setForeground(new java.awt.Color(153, 0, 0));
        lblNumChamado1.setText("Detalhes de Abertura do Chamado");

        lblNumChamado2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblNumChamado2.setText("Data da abertura :");

        jButton4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton4.setText("Abrir Chamado");

        jButton5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton5.setText("Editar Chamado");

        jButton6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton6.setText("Excluir Chamado");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDetalhes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOperador, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboxOperador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(lblContato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboxContato, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblSolicitante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboxSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboxChamado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtNumChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblNumChamado2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNumChamado2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblNumChamado3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNumChamado3))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lblNumChamado1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lblNumChamado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 752, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumChamado1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblNumChamado)
                    .addComponent(txtNumChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumChamado2)
                    .addComponent(txtNumChamado2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumChamado3)
                    .addComponent(txtNumChamado3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblDetalhes)
                    .addComponent(cboxChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblOperador)
                    .addComponent(cboxOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContato)
                    .addComponent(cboxContato, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSolicitante)
                    .addComponent(cboxSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setPreferredSize(new java.awt.Dimension(732, 242));

        lblNumChamado4.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        lblNumChamado4.setForeground(new java.awt.Color(153, 0, 0));
        lblNumChamado4.setText("Detalhes de Fechamento do Chamado");

        lblStatusChamado.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblStatusChamado.setText("Status  :");

        cboxStatus.setEditable(true);
        cboxStatus.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cboxStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Concluído", "S/ Comunicação", "Neutro", "Pendente", "Andamento" }));

        lblNumChamado5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblNumChamado5.setText("Data da fechamento :");

        lblSolucaoChamado.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblSolucaoChamado.setText("Solução :");

        txtNumChamado4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        lblNumChamado6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblNumChamado6.setText("Hora da fechamento :");

        txtNumChamado5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        cboxSolucaoChamado.setEditable(true);
        cboxSolucaoChamado.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cboxSolucaoChamado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "* Geral", "Não Necessário", "Não Houve", "Ping", "Conferencia de Dados", "Suporte ao técnico", " ", "* Soluções para aplicação", "Atualização da aplicação", "Reset", "Captura de Logs", "Alteração de configurações de rede", " ", "*Soluções Impressora", "Instalação de drivers", " ", "*Soluções Pinpad", "Configuração PPC900", "Criação de variavel de ambiente", " ", "*Soluções para o XMS (Equipamento sem monitoração)", "Reinicialização do agente Optmon", "Correção da data e hora", "Alterar TMAService.ini", " " }));

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton1.setText("Observação");

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton2.setText("Auxiliar Solução");

        jButton3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton3.setText("Fechar Chamado");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(lblNumChamado4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblStatusChamado)
                                .addGap(10, 10, 10)
                                .addComponent(cboxStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblNumChamado5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumChamado4)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblSolucaoChamado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboxSolucaoChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblNumChamado6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumChamado5)))))
                .addGap(30, 30, 30))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumChamado4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblStatusChamado)
                    .addComponent(cboxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSolucaoChamado)
                    .addComponent(cboxSolucaoChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblNumChamado5)
                    .addComponent(txtNumChamado4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumChamado6)
                    .addComponent(txtNumChamado5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblStatus4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblStatus4.setText("                           Escolha o Cliente para iniciar a pesquisa de terminais ");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(lblStatus4, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblStatus4)
                .addGap(15, 15, 15))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNumChamado9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumChamado9.setText("Status do chamado: Fechado ");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblNumChamado9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblNumChamado9)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanelChamadoLayout = new javax.swing.GroupLayout(jPanelChamado);
        jPanelChamado.setLayout(jPanelChamadoLayout);
        jPanelChamadoLayout.setHorizontalGroup(
            jPanelChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChamadoLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanelChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelChamadoLayout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(2, 2, 2))
        );
        jPanelChamadoLayout.setVerticalGroup(
            jPanelChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChamadoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanelChamadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        PaneTerm.addTab("Detalhes do Chamado", jPanelChamado);

        jMenuBar1.setPreferredSize(new java.awt.Dimension(126, 25));

        jMenuArquivos.setText("Arquivos");

        jMenuDiretorioPlanilhas.setText("Diretorio Planilhas");
        jMenuDiretorioPlanilhas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuDiretorioPlanilhasMousePressed(evt);
            }
        });
        jMenuArquivos.add(jMenuDiretorioPlanilhas);

        jMenuBar1.add(jMenuArquivos);

        jMenuTerminais.setText("Terminais");

        jMenuAddTerminal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuAddTerminal.setText("Adicionar Nova Loja");
        jMenuAddTerminal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuAddTerminalMousePressed(evt);
            }
        });
        jMenuTerminais.add(jMenuAddTerminal);

        jMenuEditTerminal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuEditTerminal.setText("Editar Loja Existente");
        jMenuTerminais.add(jMenuEditTerminal);

        jMenuExcluirTerminal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuExcluirTerminal.setText("Excluir Loja");
        jMenuTerminais.add(jMenuExcluirTerminal);
        jMenuTerminais.add(jSeparator1);

        jMenuExcluirTerminal1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuExcluirTerminal1.setText("Adicionar Terminal");
        jMenuTerminais.add(jMenuExcluirTerminal1);

        jMenuExcluirTerminal2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuExcluirTerminal2.setText("Editar Terminal Existente");
        jMenuTerminais.add(jMenuExcluirTerminal2);

        jMenuExcluirTerminal3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuExcluirTerminal3.setText("Excluir Terminal Existente");
        jMenuTerminais.add(jMenuExcluirTerminal3);

        jMenuBar1.add(jMenuTerminais);

        jMenuChamados.setText("Chamados");

        jMenuAbrirChamado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuAbrirChamado.setText("Abrir Chamado");
        jMenuAbrirChamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuAbrirChamadoMousePressed(evt);
            }
        });
        jMenuChamados.add(jMenuAbrirChamado);

        jMenuFecharChamado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuFecharChamado.setText("Fechar Chamado");
        jMenuFecharChamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuFecharChamadoMousePressed(evt);
            }
        });
        jMenuChamados.add(jMenuFecharChamado);
        jMenuChamados.add(jSeparator2);

        jMenuEditarChamado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuEditarChamado.setText("Editar Chamados Abertos");
        jMenuChamados.add(jMenuEditarChamado);

        jMenuExcluirChamado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuExcluirChamado.setText("Excluir Chamados Abertos");
        jMenuExcluirChamado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuExcluirChamadoMousePressed(evt);
            }
        });
        jMenuChamados.add(jMenuExcluirChamado);

        jMenuBar1.add(jMenuChamados);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(PaneTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(PaneTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

  
    }//GEN-LAST:event_formWindowOpened

    private void btnSelecionarChamadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelecionarChamadoMouseClicked



    }//GEN-LAST:event_btnSelecionarChamadoMouseClicked

    private void jFrameChamadosAbertosWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrameChamadosAbertosWindowClosing

    }//GEN-LAST:event_jFrameChamadosAbertosWindowClosing

    private void jMenuAbrirChamadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAbrirChamadoMousePressed
        
  
        
    }//GEN-LAST:event_jMenuAbrirChamadoMousePressed

    private void jMenuFecharChamadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuFecharChamadoMousePressed
        
  
        
    }//GEN-LAST:event_jMenuFecharChamadoMousePressed

    private void jMenuExcluirChamadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuExcluirChamadoMousePressed

    }//GEN-LAST:event_jMenuExcluirChamadoMousePressed

    private void jMenuDiretorioPlanilhasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuDiretorioPlanilhasMousePressed
        
    }//GEN-LAST:event_jMenuDiretorioPlanilhasMousePressed

    private void btnPingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPingMouseClicked
       
        
              
    }//GEN-LAST:event_btnPingMouseClicked

    private void txtNumLojaAddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumLojaAddFocusLost

    }//GEN-LAST:event_txtNumLojaAddFocusLost

    private void txtSiglaAddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSiglaAddFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSiglaAddFocusLost

    private void cboxClienteAddItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxClienteAddItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxClienteAddItemStateChanged

    private void jMenuAddTerminalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAddTerminalMousePressed
        jFrameLoja.setVisible(true);
    }//GEN-LAST:event_jMenuAddTerminalMousePressed

    private void btnPing3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPing3MouseClicked

    }//GEN-LAST:event_btnPing3MouseClicked

    private void btnIncluirLojaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncluirLojaMouseClicked
       
        String[] f = new String [8];
        getDadosTextFields(f, jFrameLoja);
//        manipula.editarCadastro(txtNumLojaAdd, "Incluir", f);
        
    }//GEN-LAST:event_btnIncluirLojaMouseClicked

    private void txtTelefoneAddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneAddKeyPressed

        formatText("(##)####-####", txtTelefoneAdd, txtTelefoneAdd.getCaretPosition(), evt);

    }//GEN-LAST:event_txtTelefoneAddKeyPressed

    private void txtNumLojaAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumLojaAddActionPerformed

    }//GEN-LAST:event_txtNumLojaAddActionPerformed

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
 
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void txtSiglaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSiglaFocusLost
       
        BuscaDados.pesquisaDados(cboxCliente , null , txtSigla);
        preencherDados(txtSigla, null);
        
    }//GEN-LAST:event_txtSiglaFocusLost

    private void cboxIdTerminalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxIdTerminalItemStateChanged
                
    }//GEN-LAST:event_cboxIdTerminalItemStateChanged

    private void cboxIdTerminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxIdTerminalActionPerformed
 
        if(evt.getModifiers() == 16){
            numTer=cboxIdTerminal.getSelectedIndex();
            preencherDados(null, cboxIdTerminal);
            
        }

    }//GEN-LAST:event_cboxIdTerminalActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane PaneTerm;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIncluirLoja;
    private javax.swing.JButton btnPing;
    private javax.swing.JButton btnPing3;
    private javax.swing.JButton btnSelecionarChamado;
    private javax.swing.JComboBox cboxChamado;
    private javax.swing.JComboBox cboxCliente;
    private javax.swing.JComboBox cboxClienteAdd;
    private javax.swing.JComboBox cboxContato;
    private javax.swing.JComboBox cboxIdTerminal;
    private javax.swing.JComboBox cboxOperador;
    private javax.swing.JComboBox cboxSolicitante;
    private javax.swing.JComboBox cboxSolucaoChamado;
    private javax.swing.JComboBox cboxStatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JFrame jFrameChamadosAbertos;
    private javax.swing.JFrame jFrameLoja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuAbrirChamado;
    private javax.swing.JMenuItem jMenuAddTerminal;
    private javax.swing.JMenu jMenuArquivos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuChamados;
    private javax.swing.JMenuItem jMenuDiretorioPlanilhas;
    private javax.swing.JMenuItem jMenuEditTerminal;
    private javax.swing.JMenuItem jMenuEditarChamado;
    private javax.swing.JMenuItem jMenuExcluirChamado;
    private javax.swing.JMenuItem jMenuExcluirTerminal;
    private javax.swing.JMenuItem jMenuExcluirTerminal1;
    private javax.swing.JMenuItem jMenuExcluirTerminal2;
    private javax.swing.JMenuItem jMenuExcluirTerminal3;
    private javax.swing.JMenuItem jMenuFecharChamado;
    private javax.swing.JMenu jMenuTerminais;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelChamado;
    private javax.swing.JPanel jPanelLogo;
    private javax.swing.JPanel jPanelLoja;
    private javax.swing.JPanel jPanelLoja2;
    private javax.swing.JPanel jPanelTerminal;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAddLoja;
    private javax.swing.JLabel lblBairroAdd;
    private javax.swing.JLabel lblCidadeAdd;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblClienteAdd;
    private javax.swing.JLabel lblConfigRede;
    private javax.swing.JLabel lblContato;
    private javax.swing.JLabel lblDetalhes;
    private javax.swing.JLabel lblEnderecoAdd;
    private javax.swing.JLabel lblEstadoAdd;
    private javax.swing.JLabel lblGateway;
    private javax.swing.JLabel lblIdTerminal;
    private javax.swing.JLabel lblInfoLoja;
    private javax.swing.JLabel lblIp;
    private javax.swing.JLabel lblLoja;
    private javax.swing.JLabel lblLojaAdd;
    private javax.swing.JLabel lblMascara;
    private javax.swing.JLabel lblNumChamado;
    private javax.swing.JLabel lblNumChamado1;
    private javax.swing.JLabel lblNumChamado2;
    private javax.swing.JLabel lblNumChamado3;
    private javax.swing.JLabel lblNumChamado4;
    private javax.swing.JLabel lblNumChamado5;
    private javax.swing.JLabel lblNumChamado6;
    private javax.swing.JLabel lblNumChamado8;
    private javax.swing.JLabel lblNumChamado9;
    private javax.swing.JLabel lblNumLoja;
    private javax.swing.JLabel lblNumLoja1;
    private javax.swing.JLabel lblNumLoja2;
    private javax.swing.JLabel lblNumLoja3;
    private javax.swing.JLabel lblNumLojaAdd;
    private javax.swing.JLabel lblNumSerie;
    private javax.swing.JLabel lblNumSerie1;
    private javax.swing.JLabel lblOperador;
    private javax.swing.JLabel lblSigla;
    private javax.swing.JLabel lblSigla1;
    private javax.swing.JLabel lblSigla2;
    private javax.swing.JLabel lblSiglaAdd;
    private javax.swing.JLabel lblSolicitante;
    private javax.swing.JLabel lblSolucaoChamado;
    private javax.swing.JLabel lblStatus3;
    private javax.swing.JLabel lblStatus4;
    private javax.swing.JLabel lblStatus5;
    private javax.swing.JLabel lblStatus6;
    private javax.swing.JLabel lblStatusChamado;
    private javax.swing.JLabel lblTelefoneAdd;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel logo;
    private javax.swing.JTable tableChamadosAbertos;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBairroAdd;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCidadeAdd;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEnderecoAdd;
    private javax.swing.JTextField txtEquipamentCode;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtEstadoAdd;
    private javax.swing.JTextField txtGateway;
    private javax.swing.JTextField txtIp;
    private javax.swing.JTextField txtLoja;
    private javax.swing.JTextField txtLojaAdd;
    private javax.swing.JTextField txtMascara;
    private javax.swing.JTextField txtNumChamado;
    private javax.swing.JTextField txtNumChamado2;
    private javax.swing.JTextField txtNumChamado3;
    private javax.swing.JTextField txtNumChamado4;
    private javax.swing.JTextField txtNumChamado5;
    private javax.swing.JTextField txtNumLoja;
    private javax.swing.JTextField txtNumLojaAdd;
    private javax.swing.JTextField txtNumSerie;
    private javax.swing.JTextField txtSigla;
    private javax.swing.JTextField txtSiglaAdd;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTelefoneAdd;
    // End of variables declaration//GEN-END:variables

}
