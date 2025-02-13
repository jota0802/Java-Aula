import java.util.ArrayList;
import java.util.Date;
import java.util.List;


//CONTINUAR EM CASA!!!...

    class Veiculo {
        private String placa;
        private Date horarioEntrada;
        private double taxa;

        public Veiculo(String placa, Date horarioEntrada, double taxa) {
            this.placa = placa;
            this.horarioEntrada = horarioEntrada;
            this.taxa = taxa;
        }

        public String getPlaca() {
            return placa;
        }

        public Date getHorarioEntrada() {
            return horarioEntrada;
        }

        public double getTaxa() {
            return taxa;
        }

        @Override
        public String toString() {
            return "Veiculo{" +
                    "placa='" + placa + '\'' +
                    ", horarioEntrada=" + horarioEntrada +
                    ", taxa=" + taxa +
                    '}';
        }
    }

    class Estacionamento {
        private List<Veiculo> veiculos;

        public Estacionamento() {
            veiculos = new ArrayList<>();
        }

        public void adicionarVeiculo(Veiculo veiculo) {
            veiculos.add(veiculo);
        }

        public void listarVeiculos() {
            for (Veiculo veiculo : veiculos) {
                System.out.println(veiculo);
            }
        }


    public class usandoMap {
        public static void main(String[] args) {
            Estacionamento estacionamento = new Estacionamento();

            // Adicionando veículos
            estacionamento.adicionarVeiculo(new Veiculo("ABC-1234", new Date(), 10.0));
            estacionamento.adicionarVeiculo(new Veiculo("XYZ-5678", new Date(), 15.0));

            // Listando veículos
            estacionamento.listarVeiculos();
        }
    }
}
