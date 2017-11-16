package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        String db_url = System.getenv("DB_URL");
        String db_user = System.getenv("DB_USER");
        String db_password = System.getenv("DB_PASSWORD");
        String page = "<!doctype html><title>Docker java demo</title><style>  body {  background-color: yellow; text-align: center; padding: 150px; }  h1 { font-size: 50px; }  body { font: 20px Helvetica, sans-serif; color: #333; }  article { display: block; text-align: left; width: 650px; margin: 0 auto; }  a { color: #dc8100; text-decoration: none; }  a:hover { color: #333; text-decoration: none; }</style><article>    <h1>Demo Java within Docker</h1>    <div>        <p> Hello from Spring  version : 2 ! </p>  </div>  <div><h2>ENV Variables</h2><h4>Database URL: " + db_url + "</h4><h4>Database User: " + db_user + "</h4><h4>Database Password: " + db_password + "</h4></div></article>";
        return page;
    }

}
