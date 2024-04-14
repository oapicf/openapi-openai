#' @docType class
#' @title ChatCompletionRole
#' @description ChatCompletionRole Class
#' @format An \code{R6Class} generator object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionRole <- R6::R6Class(
  "ChatCompletionRole",
  public = list(
    #' Initialize a new ChatCompletionRole class.
    #'
    #' @description
    #' Initialize a new ChatCompletionRole class.
    #'
    #' @param ... Optional arguments.
    #' @export
    initialize = function(...) {
      local.optional.var <- list(...)
      val <- unlist(local.optional.var)
      enumvec <- .parse_ChatCompletionRole()

      stopifnot(length(val) == 1L)

      if (!val %in% enumvec)
          stop("Use one of the valid values: ",
              paste0(enumvec, collapse = ", "))
      private$value <- val
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionRole in JSON format
    #' @export
    toJSON = function() {
        jsonlite::toJSON(private$value, auto_unbox = TRUE)
    },
    #' Deserialize JSON string into an instance of ChatCompletionRole
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRole
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRole
    #' @export
    fromJSON = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionRole in JSON format
    #' @export
    toJSONString = function() {
      as.character(jsonlite::toJSON(private$value,
          auto_unbox = TRUE))
    },
    #' Deserialize JSON string into an instance of ChatCompletionRole
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionRole
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionRole
    #' @export
    fromJSONString = function(input_json) {
      private$value <- jsonlite::fromJSON(input_json,
          simplifyVector = FALSE)
      self
    }
  ),
  private = list(
    value = NULL
  )
)

# add to utils.R
.parse_ChatCompletionRole <- function(vals) {
  res <- gsub("^\\[|\\]$", "", "[system, user, assistant, tool, function]")
  unlist(strsplit(res, ", "))
}

