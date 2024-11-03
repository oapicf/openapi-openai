#' Create a new MessageStreamEventOneOf2
#'
#' @description
#' Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
#'
#' @docType class
#' @title MessageStreamEventOneOf2
#' @description MessageStreamEventOneOf2 Class
#' @format An \code{R6Class} generator object
#' @field event  character
#' @field data  \link{MessageDeltaObject}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageStreamEventOneOf2 <- R6::R6Class(
  "MessageStreamEventOneOf2",
  public = list(
    `event` = NULL,
    `data` = NULL,

    #' @description
    #' Initialize a new MessageStreamEventOneOf2 class.
    #'
    #' @param event event
    #' @param data data
    #' @param ... Other optional arguments.
    initialize = function(`event`, `data`, ...) {
      if (!missing(`event`)) {
        if (!(`event` %in% c("thread.message.delta"))) {
          stop(paste("Error! \"", `event`, "\" cannot be assigned to `event`. Must be \"thread.message.delta\".", sep = ""))
        }
        if (!(is.character(`event`) && length(`event`) == 1)) {
          stop(paste("Error! Invalid data for `event`. Must be a string:", `event`))
        }
        self$`event` <- `event`
      }
      if (!missing(`data`)) {
        stopifnot(R6::is.R6(`data`))
        self$`data` <- `data`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return MessageStreamEventOneOf2 in JSON format
    toJSON = function() {
      MessageStreamEventOneOf2Object <- list()
      if (!is.null(self$`event`)) {
        MessageStreamEventOneOf2Object[["event"]] <-
          self$`event`
      }
      if (!is.null(self$`data`)) {
        MessageStreamEventOneOf2Object[["data"]] <-
          self$`data`$toJSON()
      }
      MessageStreamEventOneOf2Object
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageStreamEventOneOf2
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageStreamEventOneOf2
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event`)) {
        if (!is.null(this_object$`event`) && !(this_object$`event` %in% c("thread.message.delta"))) {
          stop(paste("Error! \"", this_object$`event`, "\" cannot be assigned to `event`. Must be \"thread.message.delta\".", sep = ""))
        }
        self$`event` <- this_object$`event`
      }
      if (!is.null(this_object$`data`)) {
        `data_object` <- MessageDeltaObject$new()
        `data_object`$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
        self$`data` <- `data_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return MessageStreamEventOneOf2 in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`event`)) {
          sprintf(
          '"event":
            "%s"
                    ',
          self$`event`
          )
        },
        if (!is.null(self$`data`)) {
          sprintf(
          '"data":
          %s
          ',
          jsonlite::toJSON(self$`data`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageStreamEventOneOf2
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageStreamEventOneOf2
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event`) && !(this_object$`event` %in% c("thread.message.delta"))) {
        stop(paste("Error! \"", this_object$`event`, "\" cannot be assigned to `event`. Must be \"thread.message.delta\".", sep = ""))
      }
      self$`event` <- this_object$`event`
      self$`data` <- MessageDeltaObject$new()$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to MessageStreamEventOneOf2 and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `event`
      if (!is.null(input_json$`event`)) {
        if (!(is.character(input_json$`event`) && length(input_json$`event`) == 1)) {
          stop(paste("Error! Invalid data for `event`. Must be a string:", input_json$`event`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageStreamEventOneOf2: the required field `event` is missing."))
      }
      # check the required field `data`
      if (!is.null(input_json$`data`)) {
        stopifnot(R6::is.R6(input_json$`data`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageStreamEventOneOf2: the required field `data` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MessageStreamEventOneOf2
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `event` is null
      if (is.null(self$`event`)) {
        return(FALSE)
      }

      # check if the required `data` is null
      if (is.null(self$`data`)) {
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
      # check if the required `event` is null
      if (is.null(self$`event`)) {
        invalid_fields["event"] <- "Non-nullable required field `event` cannot be null."
      }

      # check if the required `data` is null
      if (is.null(self$`data`)) {
        invalid_fields["data"] <- "Non-nullable required field `data` cannot be null."
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
# MessageStreamEventOneOf2$unlock()
#
## Below is an example to define the print function
# MessageStreamEventOneOf2$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageStreamEventOneOf2$lock()

