package org.prowikiq.object.domain.repository;

import java.util.Optional;
import org.prowikiq.object.domain.entity.FilePath;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Class: FilePathRepository Project: prowikiQ Package: org.prowikiq.object.domain.repository
 * <p>
 * Description: FilePathRepository
 *
 * @author dong-hoshin
 * @date 5/4/24 17:35 Copyright (c) 2024 Lyckabc
 * @see <a href="https://github.com/lyckabc">GitHub Repository</a>
 */
public interface FilePathRepository extends JpaRepository<FilePath, Long> {
    Optional<FilePath> findByFilePathId(Long filePathId);

}
