#' Create a new RunStepDetailsToolCallsCodeOutputImageObject
#'
#' @description
#' RunStepDetailsToolCallsCodeOutputImageObject Class
#'
#' @docType class
#' @title RunStepDetailsToolCallsCodeOutputImageObject
#' @description RunStepDetailsToolCallsCodeOutputImageObject Class
#' @format An \code{R6Class} generator object
#' @field type Always `image`. character
#' @field image  \link{RunStepDetailsToolCallsCodeOutputImageObjectImage}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDetailsToolCallsCodeOutputImageObject <- R6::R6Class(
  "RunStepDetailsToolCallsCodeOutputImageObject",
  public = list(
    `type` = NULL,
    `image` = NULL,

    #' @description
    #' Initialize a new RunStepDetailsToolCallsCodeOutputImageObject class.
    #'
    #' @param type Always `image`.
    #' @param image image
    #' @param ... Other optional arguments.
    initialize = function(`type`, `image`, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("image"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"image\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`image`)) {
        stopifnot(R6::is.R6(`image`))
        self$`image` <- `image`
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
    #' @return RunStepDetailsToolCallsCodeOutputImageObject as a base R list.
    #' @examples
    #' # convert array of RunStepDetailsToolCallsCodeOutputImageObject (x) to a data frame
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
    #' Convert RunStepDetailsToolCallsCodeOutputImageObject to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RunStepDetailsToolCallsCodeOutputImageObjectObject <- list()
      if (!is.null(self$`type`)) {
        RunStepDetailsToolCallsCodeOutputImageObjectObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`image`)) {
        RunStepDetailsToolCallsCodeOutputImageObjectObject[["image"]] <-
          self$`image`$toSimpleType()
      }
      return(RunStepDetailsToolCallsCodeOutputImageObjectObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsCodeOutputImageObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsCodeOutputImageObject
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("image"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"image\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`image`)) {
        `image_object` <- RunStepDetailsToolCallsCodeOutputImageObjectImage$new()
        `image_object`$fromJSON(jsonlite::toJSON(this_object$`image`, auto_unbox = TRUE, digits = NA))
        self$`image` <- `image_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RunStepDetailsToolCallsCodeOutputImageObject in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsCodeOutputImageObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsCodeOutputImageObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("image"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"image\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`image` <- RunStepDetailsToolCallsCodeOutputImageObjectImage$new()$fromJSON(jsonlite::toJSON(this_object$`image`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepDetailsToolCallsCodeOutputImageObject and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsCodeOutputImageObject: the required field `type` is missing."))
      }
      # check the required field `image`
      if (!is.null(input_json$`image`)) {
        stopifnot(R6::is.R6(input_json$`image`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsCodeOutputImageObject: the required field `image` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDetailsToolCallsCodeOutputImageObject
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

      # check if the required `image` is null
      if (is.null(self$`image`)) {
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

      # check if the required `image` is null
      if (is.null(self$`image`)) {
        invalid_fields["image"] <- "Non-nullable required field `image` cannot be null."
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
# RunStepDetailsToolCallsCodeOutputImageObject$unlock()
#
## Below is an example to define the print function
# RunStepDetailsToolCallsCodeOutputImageObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDetailsToolCallsCodeOutputImageObject$lock()

