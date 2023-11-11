package vn.edu.iuh.fit.frontend.admin;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.crudui.crud.impl.GridCrud;
import vn.edu.iuh.fit.backend.models.Customer;
import vn.edu.iuh.fit.backend.services.CustomerService;

@Route(value = "admin/customers", layout = MainLayout.class)
@PageTitle("Customers")
public class CustomerView extends VerticalLayout {
    public CustomerView(CustomerService customerService) {
         add(new H1("Customers Management"));
         setAlignItems(Alignment.CENTER);
         GridCrud<Customer> crudGrid = new GridCrud<>(Customer.class, customerService);
         add(crudGrid);
         setSizeFull();
    }
}
