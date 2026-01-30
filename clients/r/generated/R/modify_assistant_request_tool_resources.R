#' Create a new ModifyAssistantRequestToolResources
#'
#' @description
#' A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
#'
#' @docType class
#' @title ModifyAssistantRequestToolResources
#' @description ModifyAssistantRequestToolResources Class
#' @format An \code{R6Class} generator object
#' @field code_interpreter  \link{ModifyAssistantRequestToolResourcesCodeInterpreter} [optional]
#' @field file_search  \link{ModifyAssistantRequestToolResourcesFileSearch} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ModifyAssistantRequestToolResources <- R6::R6Class(
  "ModifyAssistantRequestToolResources",
  public = list(
    `code_interpreter` = NULL,
    `file_search` = NULL,

    #' @description
    #' Initialize a new ModifyAssistantRequestToolResources class.
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
    #' @return ModifyAssistantRequestToolResources as a base R list.
    #' @examples
    #' # convert array of ModifyAssistantRequestToolResources (x) to a data frame
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
    #' Convert ModifyAssistantRequestToolResources to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ModifyAssistantRequestToolResourcesObject <- list()
      if (!is.null(self$`code_interpreter`)) {
        ModifyAssistantRequestToolResourcesObject[["code_interpreter"]] <-
          self$`code_interpreter`$toSimpleType()
      }
      if (!is.null(self$`file_search`)) {
        ModifyAssistantRequestToolResourcesObject[["file_search"]] <-
          self$`file_search`$toSimpleType()
      }
      return(ModifyAssistantRequestToolResourcesObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ModifyAssistantRequestToolResources
    #'
    #' @param input_json the JSON input
    #' @return the instance of ModifyAssistantRequestToolResources
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code_interpreter`)) {
        `code_interpreter_object` <- ModifyAssistantRequestToolResourcesCodeInterpreter$new()
        `code_interpreter_object`$fromJSON(jsonlite::toJSON(this_object$`code_interpreter`, auto_unbox = TRUE, digits = NA))
        self$`code_interpreter` <- `code_interpreter_object`
      }
      if (!is.null(this_object$`file_search`)) {
        `file_search_object` <- ModifyAssistantRequestToolResourcesFileSearch$new()
        `file_search_object`$fromJSON(jsonlite::toJSON(this_object$`file_search`, auto_unbox = TRUE, digits = NA))
        self$`file_search` <- `file_search_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ModifyAssistantRequestToolResources in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ModifyAssistantRequestToolResources
    #'
    #' @param input_json the JSON input
    #' @return the instance of ModifyAssistantRequestToolResources
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code_interpreter` <- ModifyAssistantRequestToolResourcesCodeInterpreter$new()$fromJSON(jsonlite::toJSON(this_object$`code_interpreter`, auto_unbox = TRUE, digits = NA))
      self$`file_search` <- ModifyAssistantRequestToolResourcesFileSearch$new()$fromJSON(jsonlite::toJSON(this_object$`file_search`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ModifyAssistantRequestToolResources and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ModifyAssistantRequestToolResources
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
# ModifyAssistantRequestToolResources$unlock()
#
## Below is an example to define the print function
# ModifyAssistantRequestToolResources$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ModifyAssistantRequestToolResources$lock()

