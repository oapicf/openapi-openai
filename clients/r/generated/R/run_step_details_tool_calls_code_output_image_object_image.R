#' Create a new RunStepDetailsToolCallsCodeOutputImageObjectImage
#'
#' @description
#' RunStepDetailsToolCallsCodeOutputImageObjectImage Class
#'
#' @docType class
#' @title RunStepDetailsToolCallsCodeOutputImageObjectImage
#' @description RunStepDetailsToolCallsCodeOutputImageObjectImage Class
#' @format An \code{R6Class} generator object
#' @field file_id The [file](/docs/api-reference/files) ID of the image. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepDetailsToolCallsCodeOutputImageObjectImage <- R6::R6Class(
  "RunStepDetailsToolCallsCodeOutputImageObjectImage",
  public = list(
    `file_id` = NULL,

    #' @description
    #' Initialize a new RunStepDetailsToolCallsCodeOutputImageObjectImage class.
    #'
    #' @param file_id The [file](/docs/api-reference/files) ID of the image.
    #' @param ... Other optional arguments.
    initialize = function(`file_id`, ...) {
      if (!missing(`file_id`)) {
        if (!(is.character(`file_id`) && length(`file_id`) == 1)) {
          stop(paste("Error! Invalid data for `file_id`. Must be a string:", `file_id`))
        }
        self$`file_id` <- `file_id`
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
    #' @return RunStepDetailsToolCallsCodeOutputImageObjectImage as a base R list.
    #' @examples
    #' # convert array of RunStepDetailsToolCallsCodeOutputImageObjectImage (x) to a data frame
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
    #' Convert RunStepDetailsToolCallsCodeOutputImageObjectImage to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RunStepDetailsToolCallsCodeOutputImageObjectImageObject <- list()
      if (!is.null(self$`file_id`)) {
        RunStepDetailsToolCallsCodeOutputImageObjectImageObject[["file_id"]] <-
          self$`file_id`
      }
      return(RunStepDetailsToolCallsCodeOutputImageObjectImageObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsCodeOutputImageObjectImage
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsCodeOutputImageObjectImage
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`file_id`)) {
        self$`file_id` <- this_object$`file_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RunStepDetailsToolCallsCodeOutputImageObjectImage in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepDetailsToolCallsCodeOutputImageObjectImage
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepDetailsToolCallsCodeOutputImageObjectImage
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`file_id` <- this_object$`file_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepDetailsToolCallsCodeOutputImageObjectImage and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RunStepDetailsToolCallsCodeOutputImageObjectImage: the required field `file_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepDetailsToolCallsCodeOutputImageObjectImage
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
# RunStepDetailsToolCallsCodeOutputImageObjectImage$unlock()
#
## Below is an example to define the print function
# RunStepDetailsToolCallsCodeOutputImageObjectImage$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepDetailsToolCallsCodeOutputImageObjectImage$lock()

