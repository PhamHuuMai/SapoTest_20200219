package vn.com.sapo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.com.sapo.dto.request.UpdateConfigRequest;
import vn.com.sapo.dto.response.ResponseData;
import vn.com.sapo.service.ConfigService;

/**
 *
 * @author Mai-PC
 */
@RestController
@RequestMapping("/api/loyalty")
public class Controller {

    @Autowired
    private ConfigService configService;
    
        
    @GetMapping("/getconfig/{time}")
    public ResponseEntity<ResponseData> getConfig(@PathVariable Long time) {
        try {
            return ResponseEntity.ok(new ResponseData(configService.getConfig(time)));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.ok(new ResponseData(1));
        }
        
    }
    
    @PutMapping("/updateconfig")
    public ResponseEntity<ResponseData> updateConfig(
            @RequestBody UpdateConfigRequest request
    ) {
        try {
            configService.updateConfig(request.getMoney());
            return ResponseEntity.ok(new ResponseData());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.ok(new ResponseData(1));
        }
        
    }
}
