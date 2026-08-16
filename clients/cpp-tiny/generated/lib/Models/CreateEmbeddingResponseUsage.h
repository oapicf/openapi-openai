
/*
 * CreateEmbeddingResponse_usage.h
 *
 * The usage information for the request.
 */

#ifndef TINY_CPP_CLIENT_CreateEmbeddingResponse_usage_H_
#define TINY_CPP_CLIENT_CreateEmbeddingResponse_usage_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The usage information for the request.
 *
 *  \ingroup Models
 *
 */

class CreateEmbeddingResponse_usage{
public:

    /*! \brief Constructor.
	 */
    CreateEmbeddingResponse_usage();
    CreateEmbeddingResponse_usage(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateEmbeddingResponse_usage();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The number of tokens used by the prompt.
	 */
	int getPromptTokens();

	/*! \brief Set The number of tokens used by the prompt.
	 */
	void setPromptTokens(int  prompt_tokens);
	/*! \brief Get The total number of tokens used by the request.
	 */
	int getTotalTokens();

	/*! \brief Set The total number of tokens used by the request.
	 */
	void setTotalTokens(int  total_tokens);


    private:
    int prompt_tokens{};
    int total_tokens{};
};
}

#endif /* TINY_CPP_CLIENT_CreateEmbeddingResponse_usage_H_ */
