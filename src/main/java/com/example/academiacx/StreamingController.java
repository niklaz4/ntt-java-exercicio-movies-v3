package com.example.academiacx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/streaming")
public class StreamingController {

    @Autowired
    private StreamingService streamingService;

    @GetMapping("/list")
    public List<Streaming> getAllStreamings(){
        return streamingService.getAllStreamings();
    }

    @GetMapping("/{id}")
    public Streaming getStreamingById(@PathVariable Long id){
        return streamingService.getStreamingById(id);
    }

    @PostMapping("/save")
    public Streaming saveStreaming(@RequestBody Streaming streaming){
        return streamingService.saveStreaming(streaming);
    }

    @PutMapping("/update")
    public Streaming updateStreaming(@RequestBody Streaming streaming){
        return streamingService.updateStreaming(streaming);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStreaming(@PathVariable Long id){
        streamingService.deleteStreaming(id);
    }
}
