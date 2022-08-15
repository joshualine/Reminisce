package com.joshualine.storyboard.story;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StoryService {
    public List<Story> getStories() {
        return List.of(new Story(1L, "This is the first story", LocalDate.of(2000, Month.DECEMBER, 21)));
    }
}
