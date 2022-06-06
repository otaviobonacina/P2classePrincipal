public class Principal {
        public static void main(String[] args) {
            
            PessoaFisica pessoafisica = new PessoaFisica();
            PessoaJuridica pessoajuridica= new PessoaJuridica();

            pessoafisica.setCpf("55568779715");
            pessoajuridica.setCnpj("56412567318");
   
           System.out.println("CPF - "+pessoafisica.getCpf());
           System.out.println("CNPJ - "+pessoajuridica.getCnpj());
   
           
        }
}
