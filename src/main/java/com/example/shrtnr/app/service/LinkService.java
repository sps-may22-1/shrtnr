package com.example.shrtnr.app.service;

import com.example.shrtnr.app.domain.Link;
import com.example.shrtnr.app.repository.LinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LinkService {

    private final LinkRepository repository;

    public int save(String linkUrl) {
        Link link = Link.builder()
                .url(linkUrl)
                .build();

        return repository.save(link).getId();
    }

    public Link getById(int linkId) {
        return repository.getById(linkId);
    }
}
