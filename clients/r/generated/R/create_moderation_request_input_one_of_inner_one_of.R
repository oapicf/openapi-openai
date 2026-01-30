#' Create a new CreateModerationRequestInputOneOfInnerOneOf
#'
#' @description
#' An object describing an image to classify.
#'
#' @docType class
#' @title CreateModerationRequestInputOneOfInnerOneOf
#' @description CreateModerationRequestInputOneOfInnerOneOf Class
#' @format An \code{R6Class} generator object
#' @field type Always `image_url`. character
#' @field image_url  \link{CreateModerationRequestInputOneOfInnerOneOfImageUrl}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateModerationRequestInputOneOfInnerOneOf <- R6::R6Class(
  "CreateModerationRequestInputOneOfInnerOneOf",
  public = list(
    `type` = NULL,
    `image_url` = NULL,

    #' @description
    #' Initialize a new CreateModerationRequestInputOneOfInnerOneOf class.
    #'
    #' @param type Always `image_url`.
    #' @param image_url image_url
    #' @param ... Other optional arguments.
    initialize = function(`type`, `image_url`, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("image_url"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"image_url\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`image_url`)) {
        stopifnot(R6::is.R6(`image_url`))
        self$`image_url` <- `image_url`
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
    #' @return CreateModerationRequestInputOneOfInnerOneOf as a base R list.
    #' @examples
    #' # convert array of CreateModerationRequestInputOneOfInnerOneOf (x) to a data frame
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
    #' Convert CreateModerationRequestInputOneOfInnerOneOf to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateModerationRequestInputOneOfInnerOneOfObject <- list()
      if (!is.null(self$`type`)) {
        CreateModerationRequestInputOneOfInnerOneOfObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`image_url`)) {
        CreateModerationRequestInputOneOfInnerOneOfObject[["image_url"]] <-
          self$`image_url`$toSimpleType()
      }
      return(CreateModerationRequestInputOneOfInnerOneOfObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateModerationRequestInputOneOfInnerOneOf
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateModerationRequestInputOneOfInnerOneOf
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("image_url"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"image_url\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`image_url`)) {
        `image_url_object` <- CreateModerationRequestInputOneOfInnerOneOfImageUrl$new()
        `image_url_object`$fromJSON(jsonlite::toJSON(this_object$`image_url`, auto_unbox = TRUE, digits = NA))
        self$`image_url` <- `image_url_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateModerationRequestInputOneOfInnerOneOf in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateModerationRequestInputOneOfInnerOneOf
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateModerationRequestInputOneOfInnerOneOf
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("image_url"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"image_url\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`image_url` <- CreateModerationRequestInputOneOfInnerOneOfImageUrl$new()$fromJSON(jsonlite::toJSON(this_object$`image_url`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateModerationRequestInputOneOfInnerOneOf and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationRequestInputOneOfInnerOneOf: the required field `type` is missing."))
      }
      # check the required field `image_url`
      if (!is.null(input_json$`image_url`)) {
        stopifnot(R6::is.R6(input_json$`image_url`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationRequestInputOneOfInnerOneOf: the required field `image_url` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateModerationRequestInputOneOfInnerOneOf
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `image_url` is null
      if (is.null(self$`image_url`)) {
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `image_url` is null
      if (is.null(self$`image_url`)) {
        invalid_fields["image_url"] <- "Non-nullable required field `image_url` cannot be null."
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
# CreateModerationRequestInputOneOfInnerOneOf$unlock()
#
## Below is an example to define the print function
# CreateModerationRequestInputOneOfInnerOneOf$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateModerationRequestInputOneOfInnerOneOf$lock()

