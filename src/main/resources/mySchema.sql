CREATE TABLE contas_bancarias (
                                  id INT AUTO_INCREMENT PRIMARY KEY,
                                  agencia VARCHAR(255) NOT NULL,
                                  conta VARCHAR(255) NOT NULL,
                                  tipoConta VARCHAR(255) NOT NULL,
                                  nome VARCHAR(255) NOT NULL,
                                  saldo DECIMAL(10, 2) NOT NULL
);
