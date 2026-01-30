#' Create a new MessageContentImageFileObjectImageFile
#'
#' @description
#' MessageContentImageFileObjectImageFile Class
#'
#' @docType class
#' @title MessageContentImageFileObjectImageFile
#' @description MessageContentImageFileObjectImageFile Class
#' @format An \code{R6Class} generator object
#' @field file_id The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content. character
#' @field detail Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageContentImageFileObjectImageFile <- R6::R6Class(
  "MessageContentImageFileObjectImageFile",
  public = list(
    `file_id` = NULL,
    `detail` = NULL,

    #' @description
    #' Initialize a new MessageContentImageFileObjectImageFile class.
    #'
    #' @param file_id The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
    #' @param detail Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.. Default to "auto".
    #' @param ... Other optional arguments.
    initialize = function(`file_id`, `detail` = "auto", ...) {
      if (!missing(`file_id`)) {
        if (!(is.character(`file_id`) && length(`file_id`) == 1)) {
          stop(paste("Error! Invalid data for `file_id`. Must be a string:", `file_id`))
        }
        self$`file_id` <- `file_id`
      }
      if (!is.null(`detail`)) {
        if (!(`detail` %in% c("auto", "low", "high"))) {
          stop(paste("Error! \"", `detail`, "\" cannot be assigned to `detail`. Must be \"auto\", \"low\", \"high\".", sep = ""))
        }
        if (!(is.character(`detail`) && length(`detail`) == 1)) {
          stop(paste("Error! Invalid data for `detail`. Must be a string:", `detail`))
        }
        self$`detail` <- `detail`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return MessageContentImageFileObjectImageFile as a base R list.
    #' @examples
    #' # convert array of MessageContentImageFileObjectImageFile (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert MessageContentImageFileObjectImageFile to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MessageContentImageFileObjectImageFileObject <- list()
      if (!is.null(self$`file_id`)) {
        MessageContentImageFileObjectImageFileObject[["file_id"]] <-
          self$`file_id`
      }
      if (!is.null(self$`detail`)) {
        MessageContentImageFileObjectImageFileObject[["detail"]] <-
          self$`detail`
      }
      return(MessageContentImageFileObjectImageFileObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageContentImageFileObjectImageFile
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageContentImageFileObjectImageFile
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`file_id`)) {
        self$`file_id` <- this_object$`file_id`
      }
      if (!is.null(this_object$`detail`)) {
        if (!is.null(this_object$`detail`) && !(this_object$`detail` %in% c("auto", "low", "high"))) {
          stop(paste("Error! \"", this_object$`detail`, "\" cannot be assigned to `detail`. Must be \"auto\", \"low\", \"high\".", sep = ""))
        }
        self$`detail` <- this_object$`detail`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MessageContentImageFileObjectImageFile in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageContentImageFileObjectImageFile
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageContentImageFileObjectImageFile
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`file_id` <- this_object$`file_id`
      if (!is.null(this_object$`detail`) && !(this_object$`detail` %in% c("auto", "low", "high"))) {
        stop(paste("Error! \"", this_object$`detail`, "\" cannot be assigned to `detail`. Must be \"auto\", \"low\", \"high\".", sep = ""))
      }
      self$`detail` <- this_object$`detail`
      self
    },

    #' @description
    #' Validate JSON input with respect to MessageContentImageFileObjectImageFile and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `file_id`
      if (!is.null(input_json$`file_id`)) {
        if (!(is.character(input_json$`file_id`) && length(input_json$`file_id`) == 1)) {
          stop(paste("Error! Invalid data for `file_id`. Must be a string:", input_json$`file_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageContentImageFileObjectImageFile: the required field `file_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MessageContentImageFileObjectImageFile
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `file_id` is null
      if (is.null(self$`file_id`)) {
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
      # check if the required `file_id` is null
      if (is.null(self$`file_id`)) {
        invalid_fields["file_id"] <- "Non-nullable required field `file_id` cannot be null."
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
# MessageContentImageFileObjectImageFile$unlock()
#
## Below is an example to define the print function
# MessageContentImageFileObjectImageFile$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageContentImageFileObjectImageFile$lock()

