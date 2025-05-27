import java.awt.*;
import javax.swing.*;

public class Screen extends JFrame {
    private JPanel screen;
    private JLabel tipo, nome, rg, email, pais, mun, log, num, bairro, orgExp, cep, uf, telefone, situacao;
    private JLabel fornecedor, title, cpf, complemento;
    private JTextField tipoField, nomeField, cpfField, rgField, orgExpField, emailField, cepField, paisField;
    private JTextField ufField, ufTwoField, munField, logField, numField, complementoField, bairroField, telefoneField;
    private JRadioButton radA, radIA;
    private ButtonGroup radioGroup;
    private JComboBox<String> comboBox;
    private JButton confirmar, excluir, limpar;
    private JCheckBox chkFornecedor;
    private JTextField[] listaCampos;

    public Screen() {
        super("Tela de cadastro");
        Janela();
        listaCampos = new JTextField[] {
                tipoField, nomeField, cpfField, rgField, orgExpField, emailField, cepField,
                paisField, ufField, ufTwoField, munField, logField, numField,
                complementoField, bairroField, telefoneField };
    }

    public void Janela() {
        screen = new JPanel();
        screen.setLayout(null);

        //textos

        title = new JLabel("Cadastro de Pessoa");
        title.setBounds(30, 30, 600, 50);
        title.setFont(new Font("Arial", Font.BOLD, 60));
        title.setForeground(new Color(244, 123, 32));

        title = new JLabel("Cadastro de Pessoa");
        title.setBounds(30, 30, 600, 50);
        title.setFont(new Font("Arial", Font.BOLD, 60));
        title.setForeground(new Color(244, 123, 32));

        tipo = new JLabel("Tipo");
        tipo.setBounds(30, 110, 170, 30);
        tipo.setBorder(BorderFactory.createLineBorder(Color.black));
        tipo.setVerticalAlignment(JLabel.CENTER);
        tipo.setHorizontalAlignment(JLabel.CENTER);

        nome = new JLabel("Nome");
        nome.setBounds(30, 150, 170, 30);
        nome.setBorder(BorderFactory.createLineBorder(Color.black));
        nome.setVerticalAlignment(JLabel.CENTER);
        nome.setHorizontalAlignment(JLabel.CENTER);

        rg = new JLabel("RG / Incrição Estadual");
        rg.setBounds(30, 190, 170, 30);
        rg.setBorder(BorderFactory.createLineBorder(Color.black));
        rg.setVerticalAlignment(JLabel.CENTER);
        rg.setHorizontalAlignment(JLabel.CENTER);

        email = new JLabel("Email");
        email.setBounds(30, 230, 170, 30);
        email.setBorder(BorderFactory.createLineBorder(Color.black));
        email.setVerticalAlignment(JLabel.CENTER);
        email.setHorizontalAlignment(JLabel.CENTER);

        pais = new JLabel("Pais");
        pais.setBounds(30, 270, 170, 30);
        pais.setBorder(BorderFactory.createLineBorder(Color.black));
        pais.setVerticalAlignment(JLabel.CENTER);
        pais.setHorizontalAlignment(JLabel.CENTER);

        mun = new JLabel("Município ...");
        mun.setBounds(30, 310, 170, 30);
        mun.setBorder(BorderFactory.createLineBorder(Color.black));
        mun.setVerticalAlignment(JLabel.CENTER);
        mun.setHorizontalAlignment(JLabel.CENTER);

        log = new JLabel("Logadouro");
        log.setBounds(30, 350, 170, 30);
        log.setBorder(BorderFactory.createLineBorder(Color.black));
        log.setVerticalAlignment(JLabel.CENTER);
        log.setHorizontalAlignment(JLabel.CENTER);

        num = new JLabel("Numero");
        num.setBounds(30, 390, 170, 30);
        num.setBorder(BorderFactory.createLineBorder(Color.black));
        num.setVerticalAlignment(JLabel.CENTER);
        num.setHorizontalAlignment(JLabel.CENTER);

        bairro = new JLabel("Bairro");
        bairro.setBounds(30, 430, 170, 30);
        bairro.setBorder(BorderFactory.createLineBorder(Color.black));
        bairro.setVerticalAlignment(JLabel.CENTER);
        bairro.setHorizontalAlignment(JLabel.CENTER);

        cpf = new JLabel("CPF/CNPJ ...");
        cpf.setBounds(390, 110, 170, 30);
        cpf.setBorder(BorderFactory.createLineBorder(Color.black));
        cpf.setVerticalAlignment(JLabel.CENTER);
        cpf.setHorizontalAlignment(JLabel.CENTER);

        orgExp = new JLabel("Orgão Expeditor");
        orgExp.setBounds(390, 190, 170, 30);
        orgExp.setBorder(BorderFactory.createLineBorder(Color.black));
        orgExp.setVerticalAlignment(JLabel.CENTER);
        orgExp.setHorizontalAlignment(JLabel.CENTER);

        complemento = new JLabel("Complemento");
        complemento.setBounds(390, 390, 170, 30);
        complemento.setBorder(BorderFactory.createLineBorder(Color.black));
        complemento.setVerticalAlignment(JLabel.CENTER);
        complemento.setHorizontalAlignment(JLabel.CENTER);

        uf = new JLabel("UF...");
        uf.setBounds(580, 270, 170, 30);
        uf.setBorder(BorderFactory.createLineBorder(Color.black));
        uf.setVerticalAlignment(JLabel.CENTER);
        uf.setHorizontalAlignment(JLabel.CENTER);

        telefone = new JLabel("Telefone");
        telefone.setBounds(390, 430, 170, 30);
        telefone.setBorder(BorderFactory.createLineBorder(Color.black));
        telefone.setVerticalAlignment(JLabel.CENTER);
        telefone.setHorizontalAlignment(JLabel.CENTER);

        cep = new JLabel("CEP");
        cep.setBounds(580, 230, 170, 30);
        cep.setBorder(BorderFactory.createLineBorder(Color.black));
        cep.setVerticalAlignment(JLabel.CENTER);
        cep.setHorizontalAlignment(JLabel.CENTER);

        situacao = new JLabel("Situação");
        situacao.setBounds(770, 430, 130, 30);
        situacao.setBorder(BorderFactory.createLineBorder(Color.black));
        situacao.setVerticalAlignment(JLabel.CENTER);
        situacao.setHorizontalAlignment(JLabel.CENTER);

        fornecedor = new JLabel("Fornecedor");
        fornecedor.setBounds(800, 110, 170, 30);
        fornecedor.setBorder(BorderFactory.createLineBorder(Color.black));
        fornecedor.setVerticalAlignment(JLabel.CENTER);
        fornecedor.setHorizontalAlignment(JLabel.CENTER);

        //fim dos Textos


        //Campos

        tipoField = new JTextField(20);
        tipoField.setBounds(210, 110, 170, 30);

        nomeField = new JTextField(100);
        nomeField.setBounds(210, 150, 840, 30);
        nomeField.setBorder(BorderFactory.createLineBorder(Color.black));

        rgField = new JTextField(20);
        rgField.setBounds(210, 190, 170, 30);
        rgField.setBorder(BorderFactory.createLineBorder(Color.black));

        emailField = new JTextField(100);
        emailField.setBounds(210, 230, 351, 30);

        paisField = new JTextField("BRASIL", 20);
        paisField.setBounds(210, 270, 351, 30);
        paisField.setBackground(new Color(240, 240, 240));// Eu utilizei esse "new Color()" para pegar uma cor em especifico (Eu utilizo algumas vezes mais durante o código)

        munField = new JTextField(100);
        munField.setBounds(210, 310, 844, 30);
        munField.setBackground(new Color(240, 240, 240));

        logField = new JTextField(20);
        logField.setBounds(210, 350, 844, 30);

        numField = new JTextField(20);
        numField.setBounds(210, 390, 170, 30);

        bairroField = new JTextField(20);
        bairroField.setBounds(210, 430, 170, 30);

        orgExpField = new JTextField(20);
        orgExpField.setBounds(580, 190, 170, 30);

        cepField = new JTextField(20);
        cepField.setBounds(770, 230, 283, 30);

        cpfField = new JTextField(20);
        cpfField.setBounds(580, 110, 200, 30);
        cpfField.setBorder(BorderFactory.createLineBorder(Color.black));
        cpfField.setHorizontalAlignment(JLabel.CENTER);

        ufField = new JTextField(20);
        ufField.setBounds(770, 270, 75, 30);

        ufTwoField = new JTextField(20);
        ufTwoField.setBounds(860, 270, 192, 30);
        ufTwoField.setBackground(new Color(240, 240, 240));

        complementoField = new JTextField(20);
        complementoField.setBounds(580, 390, 476, 30);

        telefoneField = new JTextField(20);
        telefoneField.setBounds(580, 430, 170, 30);

        chkFornecedor = new JCheckBox();
        chkFornecedor.setBounds(1000, 110, 140, 30);

        tipoField = new JTextField(20);

        String[] opcoes = { "Física", "Jurídica" };
        comboBox = new JComboBox<>(opcoes);
        comboBox.setBounds(210, 110, 170, 30);

        radA = new JRadioButton("Ativo");
        radA.setBounds(920, 430, 70, 30);

        radIA = new JRadioButton("Inativo");
        radIA.setBounds(990, 430, 77, 30);

        radioGroup = new ButtonGroup();
        radioGroup.add(radA);
        radioGroup.add(radIA);

        //fim dos campos


        //botões

        confirmar = new JButton("Confirmar");
        confirmar.addActionListener(e -> Confirmar());
        confirmar.setBounds(30, 490, 140, 30);
        confirmar.setBorder(BorderFactory.createLineBorder(Color.gray));
        confirmar.setVerticalAlignment(JLabel.CENTER);
        confirmar.setHorizontalAlignment(JLabel.CENTER);
        confirmar.setBackground(new Color(244, 123, 32));
        confirmar.setForeground(Color.white);

        excluir = new JButton("Excluir");
        excluir.setBounds(180, 490, 140, 30);
        excluir.setBorder(BorderFactory.createLineBorder(Color.gray));
        excluir.setVerticalAlignment(JLabel.CENTER);
        excluir.setHorizontalAlignment(JLabel.CENTER);
        excluir.setBackground(new Color(244, 123, 32));
        excluir.setForeground(Color.white);
        excluir.addActionListener(e -> Deletar());

        limpar = new JButton("Limpar");
        limpar.setBounds(330, 490, 140, 30);
        limpar.setBorder(BorderFactory.createLineBorder(Color.gray));
        limpar.setVerticalAlignment(JLabel.CENTER);
        limpar.setHorizontalAlignment(JLabel.CENTER);
        limpar.setBackground(new Color(240, 240, 240));
        limpar.addActionListener(e -> Limpar());

        //fim dos botões

        screen.add(cpf);
        screen.add(fornecedor);
        screen.add(cpfField);
        screen.add(radA);
        screen.add(radIA);
        screen.add(ufTwoField);
        screen.add(tipo);
        screen.add(nome);
        screen.add(rg);
        screen.add(email);
        screen.add(pais);
        screen.add(mun);
        screen.add(log);
        screen.add(num);
        screen.add(bairro);
        screen.add(orgExp);
        screen.add(cep);
        screen.add(uf);
        screen.add(telefone);
        screen.add(situacao);
        screen.add(tipoField);
        screen.add(nomeField);
        screen.add(rgField);
        screen.add(emailField);
        screen.add(paisField);
        screen.add(munField);
        screen.add(logField);
        screen.add(numField);
        screen.add(bairroField);
        screen.add(orgExpField);
        screen.add(cepField);
        screen.add(ufField);
        screen.add(telefoneField);
        screen.add(title);
        screen.add(chkFornecedor);
        screen.add(confirmar);
        screen.add(excluir);
        screen.add(limpar);
        screen.add(comboBox);
        screen.add(complemento);
        screen.add(complementoField);

        this.setContentPane(screen);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1130, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void Confirmar() {

        //Aqui no botão de confirmar eu coloquei para pedir a senha do usuário(Que é 1234 aqui) pois o senhor pediu para
        //colocarmos um JPasswordField no Teams, porém, na Imagem não tinha nenhum lugar para colocar qualquer tipo de senha
        //então optei por pediur uma senha para confirmar os dados.

        //Aqui ele só cria uma JPasswordField e verifica se o que o usuário colocou é o mesmo de 1234, e segue com o processo de confirmar
        JPasswordField passwordField = new JPasswordField();
        int option = JOptionPane.showConfirmDialog(null,
                passwordField,
                "Digite sua senha para confirmar",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        if (option == JOptionPane.OK_OPTION) {
            String senha = new String(passwordField.getPassword());

            if (senha.equals("1234")) {
                JOptionPane.showMessageDialog(null,
                        "Dados Confirmados",
                        "Envio dos dados",
                        JOptionPane.INFORMATION_MESSAGE);

                Esvaziar();

            } else {
                JOptionPane.showMessageDialog(null,
                        "Senha incorreta!",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void Deletar() {
        JOptionPane.showMessageDialog(null,
        "Dados Excluídos",
        "Exclusão de dados",
        JOptionPane.INFORMATION_MESSAGE);

        Esvaziar();
    }

    private void Limpar() {
        JOptionPane.showMessageDialog(null, 
        "Campos limpos",
        "Esvaziamento de dados",
        JOptionPane.INFORMATION_MESSAGE);

        Esvaziar();
    }

    private void Esvaziar() {
        for (JTextField campo : listaCampos) {
            campo.setText("");
        }
    }

}