package cn.edu.cqupt.mislab.projectdemo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author ASUS-PC
 */
@MapperScan("cn.edu.cqupt.mislab.projectdemo.dao")
@SpringBootApplication
public class ProjectDemoApplication {
    public static void main(String[] args) { SpringApplication.run(ProjectDemoApplication.class, args);

    }

}
