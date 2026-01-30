#' Create a new ModifyAssistantRequestToolResourcesCodeInterpreter
#'
#' @description
#' ModifyAssistantRequestToolResourcesCodeInterpreter Class
#'
#' @docType class
#' @title ModifyAssistantRequestToolResourcesCodeInterpreter
#' @description ModifyAssistantRequestToolResourcesCodeInterpreter Class
#' @format An \code{R6Class} generator object
#' @field file_ids Overrides the list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ModifyAssistantRequestToolResourcesCodeInterpreter <- R6::R6Class(
  "ModifyAssistantRequestToolResourcesCodeInterpreter",
  public = list(
    `file_ids` = NULL,

    #' @description
    #' Initialize a new ModifyAssistantRequestToolResourcesCodeInterpreter class.
    #'
    #' @param file_ids Overrides the list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool.. Default to [].
    #' @param ... Other optional arguments.
    initialize = function(`file_ids` = [], ...) {
      if (!is.null(`file_ids`)) {
        stopifnot(is.vector(`file_ids`), length(`file_ids`) != 0)
        sapply(`file_ids`, function(x) stopifnot(is.character(x)))
        self$`file_ids` <- `file_ids`
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
    #' @return ModifyAssistantRequestToolResourcesCodeInterpreter as a base R list.
    #' @examples
    #' # convert array of ModifyAssistantRequestToolResourcesCodeInterpreter (x) to a data frame
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
    #' Convert ModifyAssistantRequestToolResourcesCodeInterpreter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ModifyAssistantRequestToolResourcesCodeInterpreterObject <- list()
      if (!is.null(self$`file_ids`)) {
        ModifyAssistantRequestToolResourcesCodeInterpreterObject[["file_ids"]] <-
          self$`file_ids`
      }
      return(ModifyAssistantRequestToolResourcesCodeInterpreterObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ModifyAssistantRequestToolResourcesCodeInterpreter
    #'
    #' @param input_json the JSON input
    #' @return the instance of ModifyAssistantRequestToolResourcesCodeInterpreter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`file_ids`)) {
        self$`file_ids` <- ApiClient$new()$deserializeObj(this_object$`file_ids`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ModifyAssistantRequestToolResourcesCodeInterpreter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ModifyAssistantRequestToolResourcesCodeInterpreter
    #'
    #' @param input_json the JSON input
    #' @return the instance of ModifyAssistantRequestToolResourcesCodeInterpreter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`file_ids` <- ApiClient$new()$deserializeObj(this_object$`file_ids`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to ModifyAssistantRequestToolResourcesCodeInterpreter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ModifyAssistantRequestToolResourcesCodeInterpreter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (length(self$`file_ids`) > 20) {
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
      if (length(self$`file_ids`) > 20) {
        invalid_fields["file_ids"] <- "Invalid length for `file_ids`, number of items must be less than or equal to 20."
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
# ModifyAssistantRequestToolResourcesCodeInterpreter$unlock()
#
## Below is an example to define the print function
# ModifyAssistantRequestToolResourcesCodeInterpreter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ModifyAssistantRequestToolResourcesCodeInterpreter$lock()

