package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        String page = "<!doctype html><title>Kubernetes java demo</title><style>  body {  background-color: yellow; text-align: center; padding: 150px; }  h1 { font-size: 50px; }  body { font: 20px Helvetica, sans-serif; color: #333; }  article { display: block; text-align: left; width: 650px; margin: 0 auto; }  a { color: #dc8100; text-decoration: none; }  a:hover { color: #333; text-decoration: none; }</style><article>    <h1>Demo Java within Kubernetes Cluster</h1>    <div>        <p> Hello from Spring kubernetes version : 2 ! </p>  </div></article>";
        return page;
    }

}
