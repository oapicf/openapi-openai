#' @docType class
#' @title CreateEmbeddingRequestInput
#'
#' @description CreateEmbeddingRequestInput Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateEmbeddingRequestInput <- R6::R6Class(
  "CreateEmbeddingRequestInput",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("array[array[integer]]", "array[character]", "array[integer]", "character"),

    #' @description
    #' Initialize a new CreateEmbeddingRequestInput.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "array[array[integer]]", "array[character]", "array[integer]", "character"
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "array[array[integer]]") {
        self$actual_instance <- instance
        self$actual_type <- "array[array[integer]]"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "array[character]") {
        self$actual_instance <- instance
        self$actual_type <- "array[character]"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "array[integer]") {
        self$actual_instance <- instance
        self$actual_type <- "array[integer]"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "character") {
        self$actual_instance <- instance
        self$actual_type <- "character"
      } else {
        stop(paste("Failed to initialize CreateEmbeddingRequestInput with oneOf schemas array[array[integer]], array[character], array[integer], character. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateEmbeddingRequestInput.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CreateEmbeddingRequestInput.
    fromJSONString = function(input) {
      self$fromJSON(input)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateEmbeddingRequestInput.
    #'
    #' @param input The input JSON.
    #'
    #' @return An instance of CreateEmbeddingRequestInput.
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `character_result` <- tryCatch({
          instance <- jsonlite::fromJSON(input, simplifyVector = FALSE)
          if (typeof(instance) != "character") {
            stop(sprintf("Data type doesn't match. Expected: %s. Actual: %s.", "character", typeof(instance)))
          }
          instance_type <- "character"
          matched_schemas <- append(matched_schemas, "character")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`character_result`["error"])) {
        error_messages <- append(error_messages, `character_result`["message"])
      }

      `array[character]_result` <- tryCatch({
          instance <- jsonlite::fromJSON(input, simplifyVector = FALSE)
          if (typeof(instance) != "array[character]") {
            stop(sprintf("Data type doesn't match. Expected: %s. Actual: %s.", "array[character]", typeof(instance)))
          }
          instance_type <- "array[character]"
          matched_schemas <- append(matched_schemas, "array[character]")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`array[character]_result`["error"])) {
        error_messages <- append(error_messages, `array[character]_result`["message"])
      }

      `array[integer]_result` <- tryCatch({
          instance <- jsonlite::fromJSON(input, simplifyVector = FALSE)
          if (typeof(instance) != "array[integer]") {
            stop(sprintf("Data type doesn't match. Expected: %s. Actual: %s.", "array[integer]", typeof(instance)))
          }
          instance_type <- "array[integer]"
          matched_schemas <- append(matched_schemas, "array[integer]")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`array[integer]_result`["error"])) {
        error_messages <- append(error_messages, `array[integer]_result`["message"])
      }

      `array[array[integer]]_result` <- tryCatch({
          `array[array[integer]]`$public_methods$validateJSON(input)
          `array[array[integer]]_instance` <- `array[array[integer]]`$new()
          instance <- `array[array[integer]]_instance`$fromJSON(input)
          instance_type <- "array[array[integer]]"
          matched_schemas <- append(matched_schemas, "array[array[integer]]")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`array[array[integer]]_result`["error"])) {
        error_messages <- append(error_messages, `array[array[integer]]_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into CreateEmbeddingRequestInput with oneOf schemas array[array[integer]], array[character], array[integer], character. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into CreateEmbeddingRequestInput with oneOf schemas array[array[integer]], array[character], array[integer], character. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },

    #' @description
    #' Serialize CreateEmbeddingRequestInput to JSON string.
    #'
    #' @return JSON string representation of the CreateEmbeddingRequestInput.
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },

    #' @description
    #' Serialize CreateEmbeddingRequestInput to JSON.
    #'
    #' @return JSON representation of the CreateEmbeddingRequestInput.
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },

    #' @description
    #' Validate the input JSON with respect to CreateEmbeddingRequestInput and
    #' throw exception if invalid.
    #'
    #' @param input The input JSON.
    validateJSON = function(input) {
      # backup current values
      actual_instance_bak <- self$actual_instance
      actual_type_bak <- self$actual_type

      # if it's not valid, an error will be thrown
      self$fromJSON(input)

      # no error thrown, restore old values
      self$actual_instance <- actual_instance_bak
      self$actual_type <- actual_type_bak
    },

    #' @description
    #' Returns the string representation of the instance.
    #'
    #' @return The string representation of the instance.
    toString = function() {
      jsoncontent <- c(
        sprintf('"actual_instance": %s', if (is.null(self$actual_instance)) NULL else self$actual_instance$toJSONString()),
        sprintf('"actual_type": "%s"', self$actual_type),
        sprintf('"one_of": "%s"', paste(unlist(self$one_of), collapse = ", "))
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      as.character(jsonlite::prettify(paste("{", jsoncontent, "}", sep = "")))
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
#CreateEmbeddingRequestInput$unlock()
#
## Below is an example to define the print function
#CreateEmbeddingRequestInput$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CreateEmbeddingRequestInput$lock()

