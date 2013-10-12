package com.outr.net.http.content

import java.io.InputStream

/**
 * @author Matt Hicks <matt@outr.com>
 */
case class InputStreamContent(input: InputStream,
                              contentType: String,
                              contentLength: Long,
                              lastModified: Long) extends StreamableContent