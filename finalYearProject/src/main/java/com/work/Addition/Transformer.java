package com.work;

public class Transformer {

    //=================================================================
    //==========================  USER  ===============================

    /*public static AccountDTO AccountToAccountDTO(Account account){

        AccountDTO accountDTO = null;
        if(accountDTO instanceof EmployeeDTO) {
            accountDTO = new EmployeeDTO();
        } else {
            accountDTO = new CompanyDTO();
        }

        accountDTO.setId(account.getId());
        accountDTO.setLogin(account.getLogin());
        accountDTO.setPassword1(account.getPassword());
        accountDTO.setEmail(account.getEmail());
        accountDTO.setPhone(account.getPhone());
        accountDTO.setRole(account.getRole());

        return accountDTO;
    }

    public static Account AccountDTOToAccount(AccountDTO accountDTO){
        Account account;
        if(accountDTO instanceof EmployeeDTO) {
            account = new Employee();
        } else {
            account = new Company();
        }

        account.setId(accountDTO.getId());
        account.setLogin(accountDTO.getLogin());
        account.setPassword(accountDTO.getPassword1());
        account.setEmail(accountDTO.getEmail());
        account.setPhone(accountDTO.getPhone());
        account.setRole(accountDTO.getRole());

        return account;
    }

    public static List<AccountDTO> listUserToListUserDTO(List<? extends Account> accounts){
        List<AccountDTO> accountDTOs = new LinkedList<AccountDTO>();

        for (Account account : accounts) {
            AccountDTO accountDTO = AccountToAccountDTO(account);
            accountDTOs.add(accountDTO);
        }

        return accountDTOs;
    }

    //=================================================================
    //==========================  EMPLOYEE  ===========================

    public static EmployeeDTO EmployeeToEmployeeDTO(Employee employee){
        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setId(employee.getId());
        employeeDTO.setLogin(employee.getLogin());
        employeeDTO.setPassword1(employee.getPassword());
        employeeDTO.setEmail(employee.getEmail());
        employeeDTO.setPhone(employee.getPhone());
        employeeDTO.setRole(employee.getRole());

        employeeDTO.setName(employee.getName());
        employeeDTO.setSecondName(employee.getSecondName());
        employeeDTO.setAge(employee.getAge());
        employeeDTO.setSex(employee.getSex());
        employeeDTO.setPhotoPath(employee.getPhotoPath());
        employeeDTO.setCountry(employee.getCountry());
        employeeDTO.setCity(employee.getCity());
        employeeDTO.setCv(employee.getCv());

        return employeeDTO;
    }

    public static Employee EmployeeDTOToEmployee(EmployeeDTO employeeDTO){
        Employee employee = new Employee();

        employee.setId(employeeDTO.getId());
        employee.setLogin(employeeDTO.getLogin());
        employee.setPassword(employeeDTO.getPassword1());
        employee.setEmail(employeeDTO.getEmail());
        employee.setPhone(employeeDTO.getPhone());
        employee.setRole(employeeDTO.getRole());

        employee.setName(employeeDTO.getName());
        employee.setSurname(employeeDTO.getSurname());
        employee.setSecondName(employeeDTO.getSecondName());
        employee.setAge(employeeDTO.getAge());
        employee.setSex(employeeDTO.getSex());
        employee.setPhotoPath(employeeDTO.getPhotoPath());
        employee.setCountry(employeeDTO.getCountry());
        employee.setCity(employeeDTO.getCity());
        employee.setCv(employeeDTO.getCv());

        return employee;
    }

    public static List<EmployeeDTO> listEmployeeToListEmployeeDTO(List<Employee> employees){
        List<EmployeeDTO> employeeDTOs = new LinkedList<EmployeeDTO>();

        for (Employee employee : employees) {
            EmployeeDTO employeeDTO = EmployeeToEmployeeDTO(employee);
            employeeDTOs.add(employeeDTO);
        }

        return employeeDTOs;
    }

    //=================================================================
    //==========================  COMPANY  ============================

    public static CompanyDTO CompanyToCompanyDTO(Company company){
        CompanyDTO companyDTO = new CompanyDTO();

        companyDTO.setId(company.getId());
        companyDTO.setLogin(company.getLogin());
        companyDTO.setPassword1(company.getPassword());
        companyDTO.setEmail(company.getEmail());
        companyDTO.setPhone(company.getPhone());
        companyDTO.setRole(company.getRole());

        companyDTO.setName(company.getName());
        companyDTO.setType(company.getType());
        companyDTO.setDescription(company.getDescription());
        companyDTO.setLogo(company.getLogo());
        companyDTO.setCountry(company.getCountry());
        companyDTO.setCity(company.getCity());
        companyDTO.setVacancies(company.getVacancies());

        return companyDTO;
    }

    public static Company EmployeeDTOToEmployee(CompanyDTO companyDTO){
        Company company = new Company();

        company.setId(companyDTO.getId());
        company.setLogin(companyDTO.getLogin());
        company.setPassword(companyDTO.getPassword1());
        company.setEmail(companyDTO.getEmail());
        company.setPhone(companyDTO.getPhone());
        company.setRole(companyDTO.getRole());

        company.setName(companyDTO.getName());
        company.setType(companyDTO.getType());
        company.setDescription(companyDTO.getDescription());
        company.setLogo(companyDTO.getLogo());
        company.setCountry(companyDTO.getCountry());
        company.setCity(companyDTO.getCity());
        company.setVacancies(companyDTO.getVacancies());

        return company;
    }

    public static List<CompanyDTO> listCompanyToListCompanyDTO(List<Company> companies){
        List<CompanyDTO> companyDTOs = new LinkedList<CompanyDTO>();

        for (Company company : companies) {
            CompanyDTO companyDTO = CompanyToCompanyDTO(company);
            companyDTOs.add(companyDTO);
        }

        return companyDTOs;
    }

    //=================================================================
    //==========================  VACANCY  ============================

    public static VacancyDTO VacancyToVacancyDTO(Vacancy vacancy){
        VacancyDTO vacancyDTO = new VacancyDTO();

        vacancyDTO.setId(vacancy.getId());
        vacancyDTO.setName(vacancy.getName());
        vacancyDTO.setType(vacancy.getType());
        vacancyDTO.setDescription(vacancy.getDescription());
        vacancyDTO.setSourceLink(vacancy.getSourceLink());
        vacancyDTO.setFavourite(vacancy.getFavourite());

        return vacancyDTO;
    }

    public static Vacancy VacancyDTOToVacancy(VacancyDTO vacancyDTO){
        Vacancy vacancy = new Vacancy();

        vacancy.setId(vacancyDTO.getId());
        vacancy.setName(vacancyDTO.getName());
        vacancy.setType(vacancyDTO.getType());
        vacancy.setDescription(vacancyDTO.getDescription());
        vacancy.setSourceLink(vacancyDTO.getSourceLink());
        vacancy.setFavourite(vacancyDTO.getFavourite());

        return vacancy;
    }

    public static List<VacancyDTO> listVacancyToListVacancyDTO(List<Vacancy> vacancies){
        List<VacancyDTO> vacancyDTOs = new LinkedList<VacancyDTO>();

        for (Vacancy vacancy : vacancies) {
            VacancyDTO vacancyDTO = VacancyToVacancyDTO(vacancy);
            vacancyDTOs.add(vacancyDTO);
        }

        return vacancyDTOs;
    }

    //=================================================================
    //==========================  CV  =================================
    // TO DO...
    */
}
