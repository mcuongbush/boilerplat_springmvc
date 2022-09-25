package lab2509.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;

@Controller
public class HomeController {
    @Autowired
    ServletContext context;

    @RequestMapping("/")
    public String Index() {
        System.out.println("" + context.getRealPath("/files/"));
        return "index";
    }

    @RequestMapping("apply")
    public String apply(ModelMap model, @RequestParam("fullname") String fullname, @RequestParam("cv") MultipartFile cv,
                        @RequestParam("photo") MultipartFile photo) {
        System.out.println(fullname);
        if (photo.isEmpty() || cv.isEmpty()) {
            model.addAttribute("message", "Vui lòng chọn file !");
        }
        else {
            try {

                String photoPath = context.getRealPath("/files/" + photo.getOriginalFilename());
                photo.transferTo(new File(photoPath));
                String cvPath = context.getRealPath("/files/" + cv.getOriginalFilename());
                cv.transferTo(new File(cvPath));
                System.out.println("" + context.getRealPath("/files/" + photo.getOriginalFilename()));
                System.out.println("" + context.getRealPath("/files/" + cv.getOriginalFilename()));
                model.addAttribute("fullname", fullname);
                model.addAttribute("photo_name", photo.getOriginalFilename());
                model.addAttribute("cv_name", cv.getOriginalFilename());
                model.addAttribute("cv_type", cv.getContentType());
                model.addAttribute("cv_size", cv.getSize());
                return "apply";

            } catch (Exception e) {
                e.printStackTrace();
                model.addAttribute("message", "Lỗi lưu file !");
            }
        }
        return "index";
    }
}

