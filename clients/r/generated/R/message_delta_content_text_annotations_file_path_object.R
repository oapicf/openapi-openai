#' Create a new MessageDeltaContentTextAnnotationsFilePathObject
#'
#' @description
#' A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
#'
#' @docType class
#' @title MessageDeltaContentTextAnnotationsFilePathObject
#' @description MessageDeltaContentTextAnnotationsFilePathObject Class
#' @format An \code{R6Class} generator object
#' @field index The index of the annotation in the text content part. integer
#' @field type Always `file_path`. character
#' @field text The text in the message content that needs to be replaced. character [optional]
#' @field file_path  \link{MessageDeltaContentTextAnnotationsFilePathObjectFilePath} [optional]
#' @field start_index  integer [optional]
#' @field end_index  integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageDeltaContentTextAnnotationsFilePathObject <- R6::R6Class(
  "MessageDeltaContentTextAnnotationsFilePathObject",
  public = list(
    `index` = NULL,
    `type` = NULL,
    `text` = NULL,
    `file_path` = NULL,
    `start_index` = NULL,
    `end_index` = NULL,

    #' @description
    #' Initialize a new MessageDeltaContentTextAnnotationsFilePathObject class.
    #'
    #' @param index The index of the annotation in the text content part.
    #' @param type Always `file_path`.
    #' @param text The text in the message content that needs to be replaced.
    #' @param file_path file_path
    #' @param start_index start_index
    #' @param end_index end_index
    #' @param ... Other optional arguments.
    initialize = function(`index`, `type`, `text` = NULL, `file_path` = NULL, `start_index` = NULL, `end_index` = NULL, ...) {
      if (!missing(`index`)) {
        if (!(is.numeric(`index`) && length(`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", `index`))
        }
        self$`index` <- `index`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c("file_path"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"file_path\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`text`)) {
        if (!(is.character(`text`) && length(`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", `text`))
        }
        self$`text` <- `text`
      }
      if (!is.null(`file_path`)) {
        stopifnot(R6::is.R6(`file_path`))
        self$`file_path` <- `file_path`
      }
      if (!is.null(`start_index`)) {
        if (!(is.numeric(`start_index`) && length(`start_index`) == 1)) {
          stop(paste("Error! Invalid data for `start_index`. Must be an integer:", `start_index`))
        }
        self$`start_index` <- `start_index`
      }
      if (!is.null(`end_index`)) {
        if (!(is.numeric(`end_index`) && length(`end_index`) == 1)) {
          stop(paste("Error! Invalid data for `end_index`. Must be an integer:", `end_index`))
        }
        self$`end_index` <- `end_index`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return MessageDeltaContentTextAnnotationsFilePathObject in JSON format
    toJSON = function() {
      MessageDeltaContentTextAnnotationsFilePathObjectObject <- list()
      if (!is.null(self$`index`)) {
        MessageDeltaContentTextAnnotationsFilePathObjectObject[["index"]] <-
          self$`index`
      }
      if (!is.null(self$`type`)) {
        MessageDeltaContentTextAnnotationsFilePathObjectObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`text`)) {
        MessageDeltaContentTextAnnotationsFilePathObjectObject[["text"]] <-
          self$`text`
      }
      if (!is.null(self$`file_path`)) {
        MessageDeltaContentTextAnnotationsFilePathObjectObject[["file_path"]] <-
          self$`file_path`$toJSON()
      }
      if (!is.null(self$`start_index`)) {
        MessageDeltaContentTextAnnotationsFilePathObjectObject[["start_index"]] <-
          self$`start_index`
      }
      if (!is.null(self$`end_index`)) {
        MessageDeltaContentTextAnnotationsFilePathObjectObject[["end_index"]] <-
          self$`end_index`
      }
      MessageDeltaContentTextAnnotationsFilePathObjectObject
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaContentTextAnnotationsFilePathObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaContentTextAnnotationsFilePathObject
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`index`)) {
        self$`index` <- this_object$`index`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("file_path"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"file_path\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`text`)) {
        self$`text` <- this_object$`text`
      }
      if (!is.null(this_object$`file_path`)) {
        `file_path_object` <- MessageDeltaContentTextAnnotationsFilePathObjectFilePath$new()
        `file_path_object`$fromJSON(jsonlite::toJSON(this_object$`file_path`, auto_unbox = TRUE, digits = NA))
        self$`file_path` <- `file_path_object`
      }
      if (!is.null(this_object$`start_index`)) {
        self$`start_index` <- this_object$`start_index`
      }
      if (!is.null(this_object$`end_index`)) {
        self$`end_index` <- this_object$`end_index`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return MessageDeltaContentTextAnnotationsFilePathObject in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`index`)) {
          sprintf(
          '"index":
            %d
                    ',
          self$`index`
          )
        },
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
        if (!is.null(self$`file_path`)) {
          sprintf(
          '"file_path":
          %s
          ',
          jsonlite::toJSON(self$`file_path`$toJSON(), auto_unbox = TRUE, digits = NA)
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

    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaContentTextAnnotationsFilePathObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaContentTextAnnotationsFilePathObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`index` <- this_object$`index`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("file_path"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"file_path\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`text` <- this_object$`text`
      self$`file_path` <- MessageDeltaContentTextAnnotationsFilePathObjectFilePath$new()$fromJSON(jsonlite::toJSON(this_object$`file_path`, auto_unbox = TRUE, digits = NA))
      self$`start_index` <- this_object$`start_index`
      self$`end_index` <- this_object$`end_index`
      self
    },

    #' @description
    #' Validate JSON input with respect to MessageDeltaContentTextAnnotationsFilePathObject and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `index`
      if (!is.null(input_json$`index`)) {
        if (!(is.numeric(input_json$`index`) && length(input_json$`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", input_json$`index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageDeltaContentTextAnnotationsFilePathObject: the required field `index` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageDeltaContentTextAnnotationsFilePathObject: the required field `type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MessageDeltaContentTextAnnotationsFilePathObject
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `index` is null
      if (is.null(self$`index`)) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      if (self$`start_index` < 0) {
        return(FALSE)
      }

      if (self$`end_index` < 0) {
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
      # check if the required `index` is null
      if (is.null(self$`index`)) {
        invalid_fields["index"] <- "Non-nullable required field `index` cannot be null."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      if (self$`start_index` < 0) {
        invalid_fields["start_index"] <- "Invalid value for `start_index`, must be bigger than or equal to 0."
      }

      if (self$`end_index` < 0) {
        invalid_fields["end_index"] <- "Invalid value for `end_index`, must be bigger than or equal to 0."
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
# MessageDeltaContentTextAnnotationsFilePathObject$unlock()
#
## Below is an example to define the print function
# MessageDeltaContentTextAnnotationsFilePathObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageDeltaContentTextAnnotationsFilePathObject$lock()

