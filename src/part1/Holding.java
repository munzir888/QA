package part1;
public class Holding {
    private Company[] companies;
    private  Employee[] employees = new Employee[10];


    public Holding(Company[] companies) {

        this.companies = companies;
    }



    public Company[] getCompanies() {
        return companies;
    }
    public void setCompanies(Company[] companies) {
        this.companies = companies;
    }


    public void showCompanies () {
        for (Company company: companies) {
            if (company != null) {
                System.out.println(company.getNameCompany());
            }
        }
    }

    public  Company getCompanyByName (String name) {
        Company[] company = this.companies;
        for (int i = 0; i < companies.length; i++) {
            if (companies[i]!=null && name.equals(companies[i].getNameCompany())){
                System.out.println("Есть такая компания :"+company[i].getNameCompany());
          return  companies[i];
            }

        }
        return null;
    }
     public  void  listCompany (){
        Company[] companies = this.companies ;
         System.out.println("Список компании в холдинге : ");
         for (int i = 0; i <companies.length; i++) {
             System.out.println((i+1)+"-"+companies[i].getNameCompany());
         }
     }
     public  void  sumBudgetCompany (){
        Company []companies = this.companies;
        int count = 0 ;
         for (int i = 0; i < companies.length; i++) {
             if(companies!= null){
                 count = (int) (count+companies[i].getBudget());}
         }
         System.out.println("бюджет всех компании : "+count);
     }
     public  void  countEmployee (Employee[] employee) {
         Employee[] employees = this.employees;
         int count = 0;
         int countForVoid = 0;
         for (Employee value : employees) {
             if (value != null) {
                 count++;
             } else {
                 countForVoid++;
             }

         }
         System.out.println("число рабочих : " + count);
         System.out.println("число рабочих мест :"+countForVoid);
     }

    public void addCompany(Company company ) {
        for (int i = 0; i < companies.length ; i++) {
            if(companies[i]!=null){
                companies[i]= company;
                System.out.println(companies[i] +" Добавлен в холдинг !");
                return;
            }
        }
        System.out.println(company +" не добавлен в холдинг ! ");
    }
    public  void  deleteCompany (Company company){
        for (int i = 0; i < companies.length; i++){
            if( companies[i].equals(company)){
                companies[i]=null ;
                System.out.println("компания  "+company+" удалено из холдинга  !");
            }
        }}

}

