package taxi.controller.car;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import taxi.lib.Injector;
import taxi.service.CarService;

@WebServlet(urlPatterns = "/cars/delete")
public class DeleteCarController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("taxi");
    private static final Logger logger = LogManager.getLogger(DeleteCarController.class);
    private final CarService carService = (CarService) injector.getInstance(CarService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        carService.delete(Long.parseLong(id));
        logger.info("Successfully deleted car with id = " + id);
        resp.sendRedirect("/cars/all");
    }
}
