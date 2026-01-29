#' Create a new CreateModerationRequest
#'
#' @description
#' CreateModerationRequest Class
#'
#' @docType class
#' @title CreateModerationRequest
#' @description CreateModerationRequest Class
#' @format An \code{R6Class} generator object
#' @field input  \link{CreateModerationRequestInput}
#' @field model  \link{CreateModerationRequestModel} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateModerationRequest <- R6::R6Class(
  "CreateModerationRequest",
  public = list(
    `input` = NULL,
    `model` = NULL,

    #' @description
    #' Initialize a new CreateModerationRequest class.
    #'
    #' @param input input
    #' @param model model
    #' @param ... Other optional arguments.
    initialize = function(`input`, `model` = NULL, ...) {
      if (!missing(`input`)) {
        stopifnot(R6::is.R6(`input`))
        self$`input` <- `input`
      }
      if (!is.null(`model`)) {
        stopifnot(R6::is.R6(`model`))
        self$`model` <- `model`
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
    #' @return CreateModerationRequest as a base R list.
    #' @examples
    #' # convert array of CreateModerationRequest (x) to a data frame
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
    #' Convert CreateModerationRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateModerationRequestObject <- list()
      if (!is.null(self$`input`)) {
        CreateModerationRequestObject[["input"]] <-
          self$`input`$toSimpleType()
      }
      if (!is.null(self$`model`)) {
        CreateModerationRequestObject[["model"]] <-
          self$`model`$toSimpleType()
      }
      return(CreateModerationRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateModerationRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateModerationRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`input`)) {
        `input_object` <- CreateModerationRequestInput$new()
        `input_object`$fromJSON(jsonlite::toJSON(this_object$`input`, auto_unbox = TRUE, digits = NA))
        self$`input` <- `input_object`
      }
      if (!is.null(this_object$`model`)) {
        `model_object` <- CreateModerationRequestModel$new()
        `model_object`$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
        self$`model` <- `model_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateModerationRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateModerationRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateModerationRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`input` <- CreateModerationRequestInput$new()$fromJSON(jsonlite::toJSON(this_object$`input`, auto_unbox = TRUE, digits = NA))
      self$`model` <- CreateModerationRequestModel$new()$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateModerationRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `input`
      if (!is.null(input_json$`input`)) {
        stopifnot(R6::is.R6(input_json$`input`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationRequest: the required field `input` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateModerationRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `input` is null
      if (is.null(self$`input`)) {
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
      # check if the required `input` is null
      if (is.null(self$`input`)) {
        invalid_fields["input"] <- "Non-nullable required field `input` cannot be null."
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
# CreateModerationRequest$unlock()
#
## Below is an example to define the print function
# CreateModerationRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateModerationRequest$lock()

