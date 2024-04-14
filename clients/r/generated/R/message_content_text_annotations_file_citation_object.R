#' Create a new MessageContentTextAnnotationsFileCitationObject
#'
#' @description
#' A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.
#'
#' @docType class
#' @title MessageContentTextAnnotationsFileCitationObject
#' @description MessageContentTextAnnotationsFileCitationObject Class
#' @format An \code{R6Class} generator object
#' @field type Always `file_citation`. character
#' @field text The text in the message content that needs to be replaced. character
#' @field file_citation  \link{MessageContentTextAnnotationsFileCitationObjectFileCitation}
#' @field start_index  integer
#' @field end_index  integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageContentTextAnnotationsFileCitationObject <- R6::R6Class(
  "MessageContentTextAnnotationsFileCitationObject",
  public = list(
    `type` = NULL,
    `text` = NULL,
    `file_citation` = NULL,
    `start_index` = NULL,
    `end_index` = NULL,
    #' Initialize a new MessageContentTextAnnotationsFileCitationObject class.
    #'
    #' @description
    #' Initialize a new MessageContentTextAnnotationsFileCitationObject class.
    #'
    #' @param type Always `file_citation`.
    #' @param text The text in the message content that needs to be replaced.
    #' @param file_citation file_citation
    #' @param start_index start_index
    #' @param end_index end_index
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`type`, `text`, `file_citation`, `start_index`, `end_index`, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("file_citation"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"file_citation\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`text`)) {
        if (!(is.character(`text`) && length(`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", `text`))
        }
        self$`text` <- `text`
      }
      if (!missing(`file_citation`)) {
        stopifnot(R6::is.R6(`file_citation`))
        self$`file_citation` <- `file_citation`
      }
      if (!missing(`start_index`)) {
        if (!(is.numeric(`start_index`) && length(`start_index`) == 1)) {
          stop(paste("Error! Invalid data for `start_index`. Must be an integer:", `start_index`))
        }
        self$`start_index` <- `start_index`
      }
      if (!missing(`end_index`)) {
        if (!(is.numeric(`end_index`) && length(`end_index`) == 1)) {
          stop(paste("Error! Invalid data for `end_index`. Must be an integer:", `end_index`))
        }
        self$`end_index` <- `end_index`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MessageContentTextAnnotationsFileCitationObject in JSON format
    #' @export
    toJSON = function() {
      MessageContentTextAnnotationsFileCitationObjectObject <- list()
      if (!is.null(self$`type`)) {
        MessageContentTextAnnotationsFileCitationObjectObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`text`)) {
        MessageContentTextAnnotationsFileCitationObjectObject[["text"]] <-
          self$`text`
      }
      if (!is.null(self$`file_citation`)) {
        MessageContentTextAnnotationsFileCitationObjectObject[["file_citation"]] <-
          self$`file_citation`$toJSON()
      }
      if (!is.null(self$`start_index`)) {
        MessageContentTextAnnotationsFileCitationObjectObject[["start_index"]] <-
          self$`start_index`
      }
      if (!is.null(self$`end_index`)) {
        MessageContentTextAnnotationsFileCitationObjectObject[["end_index"]] <-
          self$`end_index`
      }
      MessageContentTextAnnotationsFileCitationObjectObject
    },
    #' Deserialize JSON string into an instance of MessageContentTextAnnotationsFileCitationObject
    #'
    #' @description
    #' Deserialize JSON string into an instance of MessageContentTextAnnotationsFileCitationObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageContentTextAnnotationsFileCitationObject
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("file_citation"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"file_citation\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`text`)) {
        self$`text` <- this_object$`text`
      }
      if (!is.null(this_object$`file_citation`)) {
        `file_citation_object` <- MessageContentTextAnnotationsFileCitationObjectFileCitation$new()
        `file_citation_object`$fromJSON(jsonlite::toJSON(this_object$`file_citation`, auto_unbox = TRUE, digits = NA))
        self$`file_citation` <- `file_citation_object`
      }
      if (!is.null(this_object$`start_index`)) {
        self$`start_index` <- this_object$`start_index`
      }
      if (!is.null(this_object$`end_index`)) {
        self$`end_index` <- this_object$`end_index`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MessageContentTextAnnotationsFileCitationObject in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        },
        if (!is.null(self$`text`)) {
          sprintf(
          '"text":
            "%s"
                    ',
          self$`text`
          )
        },
        if (!is.null(self$`file_citation`)) {
          sprintf(
          '"file_citation":
          %s
          ',
          jsonlite::toJSON(self$`file_citation`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`start_index`)) {
          sprintf(
          '"start_index":
            %d
                    ',
          self$`start_index`
          )
        },
        if (!is.null(self$`end_index`)) {
          sprintf(
          '"end_index":
            %d
                    ',
          self$`end_index`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of MessageContentTextAnnotationsFileCitationObject
    #'
    #' @description
    #' Deserialize JSON string into an instance of MessageContentTextAnnotationsFileCitationObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageContentTextAnnotationsFileCitationObject
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("file_citation"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"file_citation\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`text` <- this_object$`text`
      self$`file_citation` <- MessageContentTextAnnotationsFileCitationObjectFileCitation$new()$fromJSON(jsonlite::toJSON(this_object$`file_citation`, auto_unbox = TRUE, digits = NA))
      self$`start_index` <- this_object$`start_index`
      self$`end_index` <- this_object$`end_index`
      self
    },
    #' Validate JSON input with respect to MessageContentTextAnnotationsFileCitationObject
    #'
    #' @description
    #' Validate JSON input with respect to MessageContentTextAnnotationsFileCitationObject and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageContentTextAnnotationsFileCitationObject: the required field `type` is missing."))
      }
      # check the required field `text`
      if (!is.null(input_json$`text`)) {
        if (!(is.character(input_json$`text`) && length(input_json$`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", input_json$`text`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageContentTextAnnotationsFileCitationObject: the required field `text` is missing."))
      }
      # check the required field `file_citation`
      if (!is.null(input_json$`file_citation`)) {
        stopifnot(R6::is.R6(input_json$`file_citation`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageContentTextAnnotationsFileCitationObject: the required field `file_citation` is missing."))
      }
      # check the required field `start_index`
      if (!is.null(input_json$`start_index`)) {
        if (!(is.numeric(input_json$`start_index`) && length(input_json$`start_index`) == 1)) {
          stop(paste("Error! Invalid data for `start_index`. Must be an integer:", input_json$`start_index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageContentTextAnnotationsFileCitationObject: the required field `start_index` is missing."))
      }
      # check the required field `end_index`
      if (!is.null(input_json$`end_index`)) {
        if (!(is.numeric(input_json$`end_index`) && length(input_json$`end_index`) == 1)) {
          stop(paste("Error! Invalid data for `end_index`. Must be an integer:", input_json$`end_index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageContentTextAnnotationsFileCitationObject: the required field `end_index` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MessageContentTextAnnotationsFileCitationObject
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `text` is null
      if (is.null(self$`text`)) {
        return(FALSE)
      }

      # check if the required `file_citation` is null
      if (is.null(self$`file_citation`)) {
        return(FALSE)
      }

      # check if the required `start_index` is null
      if (is.null(self$`start_index`)) {
        return(FALSE)
      }

      if (self$`start_index` < 0) {
        return(FALSE)
      }

      # check if the required `end_index` is null
      if (is.null(self$`end_index`)) {
        return(FALSE)
      }

      if (self$`end_index` < 0) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `text` is null
      if (is.null(self$`text`)) {
        invalid_fields["text"] <- "Non-nullable required field `text` cannot be null."
      }

      # check if the required `file_citation` is null
      if (is.null(self$`file_citation`)) {
        invalid_fields["file_citation"] <- "Non-nullable required field `file_citation` cannot be null."
      }

      # check if the required `start_index` is null
      if (is.null(self$`start_index`)) {
        invalid_fields["start_index"] <- "Non-nullable required field `start_index` cannot be null."
      }

      if (self$`start_index` < 0) {
        invalid_fields["start_index"] <- "Invalid value for `start_index`, must be bigger than or equal to 0."
      }

      # check if the required `end_index` is null
      if (is.null(self$`end_index`)) {
        invalid_fields["end_index"] <- "Non-nullable required field `end_index` cannot be null."
      }

      if (self$`end_index` < 0) {
        invalid_fields["end_index"] <- "Invalid value for `end_index`, must be bigger than or equal to 0."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# MessageContentTextAnnotationsFileCitationObject$unlock()
#
## Below is an example to define the print function
# MessageContentTextAnnotationsFileCitationObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageContentTextAnnotationsFileCitationObject$lock()

