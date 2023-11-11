package vn.edu.iuh.fit.frontend.admin;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.crudui.crud.impl.GridCrud;
import vn.edu.iuh.fit.backend.models.Employee;
import vn.edu.iuh.fit.backend.services.EmployeeService;

@Route(value = "admin/employees", layout = MainLayout.class)
@PageTitle("Employees")
public class EmployeeView extends VerticalLayout {
    public EmployeeView(EmployeeService employeeService){
        add(new H1("Employees Management"));
        setAlignItems(Alignment.CENTER);
        GridCrud<Employee> crudGrid = new GridCrud<>(Employee.class, employeeService);
        add(crudGrid);
        setSizeFull();
    }
}
