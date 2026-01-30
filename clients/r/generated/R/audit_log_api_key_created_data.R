#' Create a new AuditLogApiKeyCreatedData
#'
#' @description
#' The payload used to create the API key.
#'
#' @docType class
#' @title AuditLogApiKeyCreatedData
#' @description AuditLogApiKeyCreatedData Class
#' @format An \code{R6Class} generator object
#' @field scopes A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]` list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AuditLogApiKeyCreatedData <- R6::R6Class(
  "AuditLogApiKeyCreatedData",
  public = list(
    `scopes` = NULL,

    #' @description
    #' Initialize a new AuditLogApiKeyCreatedData class.
    #'
    #' @param scopes A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
    #' @param ... Other optional arguments.
    initialize = function(`scopes` = NULL, ...) {
      if (!is.null(`scopes`)) {
        stopifnot(is.vector(`scopes`), length(`scopes`) != 0)
        sapply(`scopes`, function(x) stopifnot(is.character(x)))
        self$`scopes` <- `scopes`
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
    #' @return AuditLogApiKeyCreatedData as a base R list.
    #' @examples
    #' # convert array of AuditLogApiKeyCreatedData (x) to a data frame
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
    #' Convert AuditLogApiKeyCreatedData to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AuditLogApiKeyCreatedDataObject <- list()
      if (!is.null(self$`scopes`)) {
        AuditLogApiKeyCreatedDataObject[["scopes"]] <-
          self$`scopes`
      }
      return(AuditLogApiKeyCreatedDataObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogApiKeyCreatedData
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogApiKeyCreatedData
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`scopes`)) {
        self$`scopes` <- ApiClient$new()$deserializeObj(this_object$`scopes`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AuditLogApiKeyCreatedData in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AuditLogApiKeyCreatedData
    #'
    #' @param input_json the JSON input
    #' @return the instance of AuditLogApiKeyCreatedData
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`scopes` <- ApiClient$new()$deserializeObj(this_object$`scopes`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to AuditLogApiKeyCreatedData and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AuditLogApiKeyCreatedData
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
# AuditLogApiKeyCreatedData$unlock()
#
## Below is an example to define the print function
# AuditLogApiKeyCreatedData$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AuditLogApiKeyCreatedData$lock()

