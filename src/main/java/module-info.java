/*
 * semanticcms-news-all - Convenience POM to include most SemanticCMS News features, not including documentation or examples.
 * Copyright (C) 2021, 2022  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of semanticcms-news-all.
 *
 * semanticcms-news-all is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * semanticcms-news-all is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with semanticcms-news-all.  If not, see <https://www.gnu.org/licenses/>.
 */
module com.semanticcms.news.all {
  // Direct
  requires transitive com.semanticcms.news.model; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-model</artifactId>
  requires transitive com.semanticcms.news.servlet; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-servlet</artifactId>
  requires transitive com.semanticcms.news.taglib; // <groupId>com.semanticcms</groupId><artifactId>semanticcms-news-taglib</artifactId>
}
