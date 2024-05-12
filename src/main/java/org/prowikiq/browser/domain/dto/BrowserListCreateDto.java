package org.prowikiq.browser.domain.dto;


import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.prowikiq.browser.domain.entity.BrowserList;
import org.prowikiq.object.domain.entity.StorageObject;
import org.prowikiq.todo.domain.entity.ToDo;
import org.prowikiq.user.domain.entity.User;
import org.prowikiq.wiki.domain.entity.WikiPage;

/**
 * Class: BrowserListCreateDto Project: prowikiQ Package: org.prowikiq.browser.domain.dto
 * <p>
 * Description: BrowserListCreateDto
 *
 * @author dong-hoshin
 * @date 4/29/24 21:16 Copyright (c) 2024 Lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BrowserListCreateDto {
    private Long browserListId;
    //page
    private Long pageId;
    private String pageTitle;
    private String pageCategory;
    private String pagePath;

    //BaseEntity
    private LocalDateTime createdAt; // Include createdAt
    private LocalDateTime modifiedAt; // Include modifiedAt
    private LocalDateTime latestedAt;


    //object
    private StorageObject storageObjectId;
    private String objectName;
    private Boolean isFolder;
    private String objectPath;


    //User
    private Long userId;
    private String userPhoneNum;
    private Long createdAtUserId;
    private Long modifiedAtUserId;

    // Additional user-related fields for todo functionality
    private Long requestUserId;
    private Long solvedUserId;

    // Todo
    private Long toDoId;
    private String toDoTitle;
    private LocalDateTime targetDay;
    private LocalDateTime finishedDay;

    //
    private String status;

    public static BrowserListCreateDto fromEntity(BrowserList browserList) {
        return BrowserListCreateDto.builder()
            .browserListId(browserList.getBrowserListId())
            .pageId(browserList.getPageId() != null ? browserList.getPageId().getPageId() : null)
            .pageTitle(browserList.getPageId() != null ? browserList.getPageId().getPageTitle() : null)
            .pageCategory(browserList.getPageId() != null ? browserList.getPageId().getPageCategory() : null)
            .userId(browserList.getUserId() != null ? browserList.getUserId().getUserId() : null)
            .userPhoneNum(browserList.getUserId() != null ? browserList.getUserId().getUserPhoneNum() : null) // Example to include user's phone
            .toDoId(browserList.getToDoId() != null ? browserList.getToDoId().getToDoId() : null)
            .toDoTitle(browserList.getToDoId() != null ? browserList.getToDoId().getToDoTitle() : null)
//            .status(browserList.getStatus())
            .build();
    }
}
