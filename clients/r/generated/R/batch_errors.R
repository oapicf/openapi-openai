#' Create a new BatchErrors
#'
#' @description
#' BatchErrors Class
#'
#' @docType class
#' @title BatchErrors
#' @description BatchErrors Class
#' @format An \code{R6Class} generator object
#' @field object The object type, which is always `list`. character [optional]
#' @field data  list(\link{BatchErrorsDataInner}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BatchErrors <- R6::R6Class(
  "BatchErrors",
  public = list(
    `object` = NULL,
    `data` = NULL,

    #' @description
    #' Initialize a new BatchErrors class.
    #'
    #' @param object The object type, which is always `list`.
    #' @param data data
    #' @param ... Other optional arguments.
    initialize = function(`object` = NULL, `data` = NULL, ...) {
      if (!is.null(`object`)) {
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!is.null(`data`)) {
        stopifnot(is.vector(`data`), length(`data`) != 0)
        sapply(`data`, function(x) stopifnot(R6::is.R6(x)))
        self$`data` <- `data`
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
    #' @return BatchErrors as a base R list.
    #' @examples
    #' # convert array of BatchErrors (x) to a data frame
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
    #' Convert BatchErrors to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BatchErrorsObject <- list()
      if (!is.null(self$`object`)) {
        BatchErrorsObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`data`)) {
        BatchErrorsObject[["data"]] <-
          lapply(self$`data`, function(x) x$toSimpleType())
      }
      return(BatchErrorsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BatchErrors
    #'
    #' @param input_json the JSON input
    #' @return the instance of BatchErrors
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`data`)) {
        self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[BatchErrorsDataInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BatchErrors in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BatchErrors
    #'
    #' @param input_json the JSON input
    #' @return the instance of BatchErrors
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`object` <- this_object$`object`
      self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[BatchErrorsDataInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to BatchErrors and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BatchErrors
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
# BatchErrors$unlock()
#
## Below is an example to define the print function
# BatchErrors$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BatchErrors$lock()

