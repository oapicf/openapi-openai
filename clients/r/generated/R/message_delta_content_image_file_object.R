#' Create a new MessageDeltaContentImageFileObject
#'
#' @description
#' References an image [File](/docs/api-reference/files) in the content of a message.
#'
#' @docType class
#' @title MessageDeltaContentImageFileObject
#' @description MessageDeltaContentImageFileObject Class
#' @format An \code{R6Class} generator object
#' @field index The index of the content part in the message. integer
#' @field type Always `image_file`. character
#' @field image_file  \link{MessageDeltaContentImageFileObjectImageFile} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageDeltaContentImageFileObject <- R6::R6Class(
  "MessageDeltaContentImageFileObject",
  public = list(
    `index` = NULL,
    `type` = NULL,
    `image_file` = NULL,
    #' Initialize a new MessageDeltaContentImageFileObject class.
    #'
    #' @description
    #' Initialize a new MessageDeltaContentImageFileObject class.
    #'
    #' @param index The index of the content part in the message.
    #' @param type Always `image_file`.
    #' @param image_file image_file
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`index`, `type`, `image_file` = NULL, ...) {
      if (!missing(`index`)) {
        if (!(is.numeric(`index`) && length(`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", `index`))
        }
        self$`index` <- `index`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c("image_file"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"image_file\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`image_file`)) {
        stopifnot(R6::is.R6(`image_file`))
        self$`image_file` <- `image_file`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MessageDeltaContentImageFileObject in JSON format
    #' @export
    toJSON = function() {
      MessageDeltaContentImageFileObjectObject <- list()
      if (!is.null(self$`index`)) {
        MessageDeltaContentImageFileObjectObject[["index"]] <-
          self$`index`
      }
      if (!is.null(self$`type`)) {
        MessageDeltaContentImageFileObjectObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`image_file`)) {
        MessageDeltaContentImageFileObjectObject[["image_file"]] <-
          self$`image_file`$toJSON()
      }
      MessageDeltaContentImageFileObjectObject
    },
    #' Deserialize JSON string into an instance of MessageDeltaContentImageFileObject
    #'
    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaContentImageFileObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaContentImageFileObject
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`index`)) {
        self$`index` <- this_object$`index`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("image_file"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"image_file\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`image_file`)) {
        `image_file_object` <- MessageDeltaContentImageFileObjectImageFile$new()
        `image_file_object`$fromJSON(jsonlite::toJSON(this_object$`image_file`, auto_unbox = TRUE, digits = NA))
        self$`image_file` <- `image_file_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MessageDeltaContentImageFileObject in JSON format
    #' @export
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
        if (!is.null(self$`image_file`)) {
          sprintf(
          '"image_file":
          %s
          ',
          jsonlite::toJSON(self$`image_file`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of MessageDeltaContentImageFileObject
    #'
    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaContentImageFileObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaContentImageFileObject
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`index` <- this_object$`index`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("image_file"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"image_file\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`image_file` <- MessageDeltaContentImageFileObjectImageFile$new()$fromJSON(jsonlite::toJSON(this_object$`image_file`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to MessageDeltaContentImageFileObject
    #'
    #' @description
    #' Validate JSON input with respect to MessageDeltaContentImageFileObject and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `index`
      if (!is.null(input_json$`index`)) {
        if (!(is.numeric(input_json$`index`) && length(input_json$`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", input_json$`index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageDeltaContentImageFileObject: the required field `index` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageDeltaContentImageFileObject: the required field `type` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MessageDeltaContentImageFileObject
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
      # check if the required `index` is null
      if (is.null(self$`index`)) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
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
      # check if the required `index` is null
      if (is.null(self$`index`)) {
        invalid_fields["index"] <- "Non-nullable required field `index` cannot be null."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
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
# MessageDeltaContentImageFileObject$unlock()
#
## Below is an example to define the print function
# MessageDeltaContentImageFileObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageDeltaContentImageFileObject$lock()

