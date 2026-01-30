#' Create a new CreateAssistantRequestToolResources
#'
#' @description
#' A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
#'
#' @docType class
#' @title CreateAssistantRequestToolResources
#' @description CreateAssistantRequestToolResources Class
#' @format An \code{R6Class} generator object
#' @field code_interpreter  \link{CreateAssistantRequestToolResourcesCodeInterpreter} [optional]
#' @field file_search  \link{CreateAssistantRequestToolResourcesFileSearch} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateAssistantRequestToolResources <- R6::R6Class(
  "CreateAssistantRequestToolResources",
  public = list(
    `code_interpreter` = NULL,
    `file_search` = NULL,

    #' @description
    #' Initialize a new CreateAssistantRequestToolResources class.
    #'
    #' @param code_interpreter code_interpreter
    #' @param file_search file_search
    #' @param ... Other optional arguments.
    initialize = function(`code_interpreter` = NULL, `file_search` = NULL, ...) {
      if (!is.null(`code_interpreter`)) {
        stopifnot(R6::is.R6(`code_interpreter`))
        self$`code_interpreter` <- `code_interpreter`
      }
      if (!is.null(`file_search`)) {
        stopifnot(R6::is.R6(`file_search`))
        self$`file_search` <- `file_search`
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
    #' @return CreateAssistantRequestToolResources as a base R list.
    #' @examples
    #' # convert array of CreateAssistantRequestToolResources (x) to a data frame
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
    #' Convert CreateAssistantRequestToolResources to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateAssistantRequestToolResourcesObject <- list()
      if (!is.null(self$`code_interpreter`)) {
        CreateAssistantRequestToolResourcesObject[["code_interpreter"]] <-
          self$`code_interpreter`$toSimpleType()
      }
      if (!is.null(self$`file_search`)) {
        CreateAssistantRequestToolResourcesObject[["file_search"]] <-
          self$`file_search`$toSimpleType()
      }
      return(CreateAssistantRequestToolResourcesObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssistantRequestToolResources
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssistantRequestToolResources
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code_interpreter`)) {
        `code_interpreter_object` <- CreateAssistantRequestToolResourcesCodeInterpreter$new()
        `code_interpreter_object`$fromJSON(jsonlite::toJSON(this_object$`code_interpreter`, auto_unbox = TRUE, digits = NA))
        self$`code_interpreter` <- `code_interpreter_object`
      }
      if (!is.null(this_object$`file_search`)) {
        `file_search_object` <- CreateAssistantRequestToolResourcesFileSearch$new()
        `file_search_object`$fromJSON(jsonlite::toJSON(this_object$`file_search`, auto_unbox = TRUE, digits = NA))
        self$`file_search` <- `file_search_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateAssistantRequestToolResources in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssistantRequestToolResources
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssistantRequestToolResources
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code_interpreter` <- CreateAssistantRequestToolResourcesCodeInterpreter$new()$fromJSON(jsonlite::toJSON(this_object$`code_interpreter`, auto_unbox = TRUE, digits = NA))
      self$`file_search` <- CreateAssistantRequestToolResourcesFileSearch$new()$fromJSON(jsonlite::toJSON(this_object$`file_search`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateAssistantRequestToolResources and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateAssistantRequestToolResources
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
# CreateAssistantRequestToolResources$unlock()
#
## Below is an example to define the print function
# CreateAssistantRequestToolResources$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateAssistantRequestToolResources$lock()

