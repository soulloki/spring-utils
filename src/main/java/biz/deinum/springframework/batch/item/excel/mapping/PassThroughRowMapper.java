/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */package biz.deinum.springframework.batch.item.excel.mapping;

import biz.deinum.springframework.batch.item.excel.RowMapper;
import biz.deinum.springframework.batch.item.excel.Sheet;

/**
 * Pass through {@link RowMapper} useful for passing the orginal String[]
 * back directly rather than a mapped object.
 * 
 * @author marten
 * 
 */
public class PassThroughRowMapper implements RowMapper<String[]> {

    public String[] mapRow(final Sheet sheet, final String[] row, final int rowNum) throws Exception {
        return row;
    }

}
