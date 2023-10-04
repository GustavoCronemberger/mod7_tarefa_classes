/**
 * @author Gustavo Cronemberger
 */
public class Automovel {

        private int codigo;

        private String tipo;

        private int ano;

        private String nome;

        public int getCodigo() {
                return codigo;
        }

        /**
         * Método que da retorno das características do automóvel escolhido
         * @return retorna o que foi pedido
         *
         * @since V1
         */
        public void setCodigo(int codigo) {
                this.codigo = codigo;
        }

        public String getTipo() {
                return tipo;
        }

        public void setTipo(String tipo) {
                this.tipo = tipo;
        }

        public int getAno() {
                return ano;
        }

        public void setAno(int ano) {
                this.ano = ano;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public static int getAnoDoVeiculo(){
                return 2023;
        }

        public static String getModeloDoVeiculo(){
                return "Corolla";
        }

        public static String getTipoDeAutomovel(){
                return "Carro";
        }

        public static int getCodigoDoVeiculo(){
                return 2230030;
        }
}
