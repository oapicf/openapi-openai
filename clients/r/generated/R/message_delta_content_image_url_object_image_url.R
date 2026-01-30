#' Create a new MessageDeltaContentImageUrlObjectImageUrl
#'
#' @description
#' MessageDeltaContentImageUrlObjectImageUrl Class
#'
#' @docType class
#' @title MessageDeltaContentImageUrlObjectImageUrl
#' @description MessageDeltaContentImageUrlObjectImageUrl Class
#' @format An \code{R6Class} generator object
#' @field url The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp. character [optional]
#' @field detail Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageDeltaContentImageUrlObjectImageUrl <- R6::R6Class(
  "MessageDeltaContentImageUrlObjectImageUrl",
  public = list(
    `url` = NULL,
    `detail` = NULL,

    #' @description
    #' Initialize a new MessageDeltaContentImageUrlObjectImageUrl class.
    #'
    #' @param url The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
    #' @param detail Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.. Default to "auto".
    #' @param ... Other optional arguments.
    initialize = function(`url` = NULL, `detail` = "auto", ...) {
      if (!is.null(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
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
    #' @return MessageDeltaContentImageUrlObjectImageUrl as a base R list.
    #' @examples
    #' # convert array of MessageDeltaContentImageUrlObjectImageUrl (x) to a data frame
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
    #' Convert MessageDeltaContentImageUrlObjectImageUrl to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MessageDeltaContentImageUrlObjectImageUrlObject <- list()
      if (!is.null(self$`url`)) {
        MessageDeltaContentImageUrlObjectImageUrlObject[["url"]] <-
          self$`url`
      }
      if (!is.null(self$`detail`)) {
        MessageDeltaContentImageUrlObjectImageUrlObject[["detail"]] <-
          self$`detail`
      }
      return(MessageDeltaContentImageUrlObjectImageUrlObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaContentImageUrlObjectImageUrl
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaContentImageUrlObjectImageUrl
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
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
    #' @return MessageDeltaContentImageUrlObjectImageUrl in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaContentImageUrlObjectImageUrl
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaContentImageUrlObjectImageUrl
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`url` <- this_object$`url`
      if (!is.null(this_object$`detail`) && !(this_object$`detail` %in% c("auto", "low", "high"))) {
        stop(paste("Error! \"", this_object$`detail`, "\" cannot be assigned to `detail`. Must be \"auto\", \"low\", \"high\".", sep = ""))
      }
      self$`detail` <- this_object$`detail`
      self
    },

    #' @description
    #' Validate JSON input with respect to MessageDeltaContentImageUrlObjectImageUrl and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MessageDeltaContentImageUrlObjectImageUrl
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# MessageDeltaContentImageUrlObjectImageUrl$unlock()
#
## Below is an example to define the print function
# MessageDeltaContentImageUrlObjectImageUrl$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageDeltaContentImageUrlObjectImageUrl$lock()

