#' Create a new MessageDeltaObjectDelta
#'
#' @description
#' The delta containing the fields that have changed on the Message.
#'
#' @docType class
#' @title MessageDeltaObjectDelta
#' @description MessageDeltaObjectDelta Class
#' @format An \code{R6Class} generator object
#' @field role The entity that produced the message. One of `user` or `assistant`. character [optional]
#' @field content The content of the message in array of text and/or images. list(\link{MessageDeltaObjectDeltaContentInner}) [optional]
#' @field file_ids A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageDeltaObjectDelta <- R6::R6Class(
  "MessageDeltaObjectDelta",
  public = list(
    `role` = NULL,
    `content` = NULL,
    `file_ids` = NULL,

    #' @description
    #' Initialize a new MessageDeltaObjectDelta class.
    #'
    #' @param role The entity that produced the message. One of `user` or `assistant`.
    #' @param content The content of the message in array of text and/or images.
    #' @param file_ids A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.. Default to [].
    #' @param ... Other optional arguments.
    initialize = function(`role` = NULL, `content` = NULL, `file_ids` = [], ...) {
      if (!is.null(`role`)) {
        if (!(`role` %in% c("user", "assistant"))) {
          stop(paste("Error! \"", `role`, "\" cannot be assigned to `role`. Must be \"user\", \"assistant\".", sep = ""))
        }
        if (!(is.character(`role`) && length(`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", `role`))
        }
        self$`role` <- `role`
      }
      if (!is.null(`content`)) {
        stopifnot(is.vector(`content`), length(`content`) != 0)
        sapply(`content`, function(x) stopifnot(R6::is.R6(x)))
        self$`content` <- `content`
      }
      if (!is.null(`file_ids`)) {
        stopifnot(is.vector(`file_ids`), length(`file_ids`) != 0)
        sapply(`file_ids`, function(x) stopifnot(is.character(x)))
        self$`file_ids` <- `file_ids`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return MessageDeltaObjectDelta in JSON format
    toJSON = function() {
      MessageDeltaObjectDeltaObject <- list()
      if (!is.null(self$`role`)) {
        MessageDeltaObjectDeltaObject[["role"]] <-
          self$`role`
      }
      if (!is.null(self$`content`)) {
        MessageDeltaObjectDeltaObject[["content"]] <-
          lapply(self$`content`, function(x) x$toJSON())
      }
      if (!is.null(self$`file_ids`)) {
        MessageDeltaObjectDeltaObject[["file_ids"]] <-
          self$`file_ids`
      }
      MessageDeltaObjectDeltaObject
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaObjectDelta
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaObjectDelta
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`role`)) {
        if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("user", "assistant"))) {
          stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"user\", \"assistant\".", sep = ""))
        }
        self$`role` <- this_object$`role`
      }
      if (!is.null(this_object$`content`)) {
        self$`content` <- ApiClient$new()$deserializeObj(this_object$`content`, "array[MessageDeltaObjectDeltaContentInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`file_ids`)) {
        self$`file_ids` <- ApiClient$new()$deserializeObj(this_object$`file_ids`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return MessageDeltaObjectDelta in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`role`)) {
          sprintf(
          '"role":
            "%s"
                    ',
          self$`role`
          )
        },
        if (!is.null(self$`content`)) {
          sprintf(
          '"content":
          [%s]
',
          paste(sapply(self$`content`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`file_ids`)) {
          sprintf(
          '"file_ids":
             [%s]
          ',
          paste(unlist(lapply(self$`file_ids`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaObjectDelta
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaObjectDelta
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("user", "assistant"))) {
        stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"user\", \"assistant\".", sep = ""))
      }
      self$`role` <- this_object$`role`
      self$`content` <- ApiClient$new()$deserializeObj(this_object$`content`, "array[MessageDeltaObjectDeltaContentInner]", loadNamespace("openapi"))
      self$`file_ids` <- ApiClient$new()$deserializeObj(this_object$`file_ids`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to MessageDeltaObjectDelta and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MessageDeltaObjectDelta
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (length(self$`file_ids`) > 10) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      if (length(self$`file_ids`) > 10) {
        invalid_fields["file_ids"] <- "Invalid length for `file_ids`, number of items must be less than or equal to 10."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# MessageDeltaObjectDelta$unlock()
#
## Below is an example to define the print function
# MessageDeltaObjectDelta$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageDeltaObjectDelta$lock()

