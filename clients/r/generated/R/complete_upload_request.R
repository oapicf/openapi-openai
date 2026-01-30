#' Create a new CompleteUploadRequest
#'
#' @description
#' CompleteUploadRequest Class
#'
#' @docType class
#' @title CompleteUploadRequest
#' @description CompleteUploadRequest Class
#' @format An \code{R6Class} generator object
#' @field part_ids The ordered list of Part IDs. list(character)
#' @field md5 The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CompleteUploadRequest <- R6::R6Class(
  "CompleteUploadRequest",
  public = list(
    `part_ids` = NULL,
    `md5` = NULL,

    #' @description
    #' Initialize a new CompleteUploadRequest class.
    #'
    #' @param part_ids The ordered list of Part IDs.
    #' @param md5 The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect.
    #' @param ... Other optional arguments.
    initialize = function(`part_ids`, `md5` = NULL, ...) {
      if (!missing(`part_ids`)) {
        stopifnot(is.vector(`part_ids`), length(`part_ids`) != 0)
        sapply(`part_ids`, function(x) stopifnot(is.character(x)))
        self$`part_ids` <- `part_ids`
      }
      if (!is.null(`md5`)) {
        if (!(is.character(`md5`) && length(`md5`) == 1)) {
          stop(paste("Error! Invalid data for `md5`. Must be a string:", `md5`))
        }
        self$`md5` <- `md5`
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
    #' @return CompleteUploadRequest as a base R list.
    #' @examples
    #' # convert array of CompleteUploadRequest (x) to a data frame
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
    #' Convert CompleteUploadRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CompleteUploadRequestObject <- list()
      if (!is.null(self$`part_ids`)) {
        CompleteUploadRequestObject[["part_ids"]] <-
          self$`part_ids`
      }
      if (!is.null(self$`md5`)) {
        CompleteUploadRequestObject[["md5"]] <-
          self$`md5`
      }
      return(CompleteUploadRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CompleteUploadRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CompleteUploadRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`part_ids`)) {
        self$`part_ids` <- ApiClient$new()$deserializeObj(this_object$`part_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`md5`)) {
        self$`md5` <- this_object$`md5`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CompleteUploadRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CompleteUploadRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CompleteUploadRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`part_ids` <- ApiClient$new()$deserializeObj(this_object$`part_ids`, "array[character]", loadNamespace("openapi"))
      self$`md5` <- this_object$`md5`
      self
    },

    #' @description
    #' Validate JSON input with respect to CompleteUploadRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `part_ids`
      if (!is.null(input_json$`part_ids`)) {
        stopifnot(is.vector(input_json$`part_ids`), length(input_json$`part_ids`) != 0)
        tmp <- sapply(input_json$`part_ids`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CompleteUploadRequest: the required field `part_ids` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CompleteUploadRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `part_ids` is null
      if (is.null(self$`part_ids`)) {
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
      # check if the required `part_ids` is null
      if (is.null(self$`part_ids`)) {
        invalid_fields["part_ids"] <- "Non-nullable required field `part_ids` cannot be null."
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
# CompleteUploadRequest$unlock()
#
## Below is an example to define the print function
# CompleteUploadRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CompleteUploadRequest$lock()

