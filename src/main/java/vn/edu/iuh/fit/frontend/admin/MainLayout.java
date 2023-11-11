package vn.edu.iuh.fit.frontend.admin;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.router.RouterLink;

public class MainLayout extends Div implements RouterLayout {
    private final Tabs tabs = new Tabs();

    public MainLayout() {
        tabs.add(createTab("Home", ""));
        tabs.add(createTab("Customers", "admin/customers"));
        tabs.add(createTab("Products", "admin/products"));
        tabs.add(createTab("Employees", "admin/employees"));

        HorizontalLayout header = new HorizontalLayout();
        header.setWidthFull();

        add(header, tabs);
    }

    private Tab createTab(String label, String route) {
        RouterLink link = new RouterLink(label, getPage(route));
        return new Tab(link);
    }

    private Class<? extends Component> getPage(String route) {
        return switch (route) {
            case "admin/customers" -> CustomerView.class;
            case "admin/products" -> ProductsView.class;
            case "admin/employees" -> EmployeeView.class;
            default -> Home.class;
        };
    }
}
