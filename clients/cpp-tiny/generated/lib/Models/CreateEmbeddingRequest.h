
/*
 * CreateEmbeddingRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateEmbeddingRequest_H_
#define TINY_CPP_CLIENT_CreateEmbeddingRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateEmbeddingRequest_input.h"
#include "CreateEmbeddingRequest_model.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateEmbeddingRequest{
public:

    /*! \brief Constructor.
	 */
    CreateEmbeddingRequest();
    CreateEmbeddingRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateEmbeddingRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CreateEmbeddingRequest_input getInput();

	/*! \brief Set 
	 */
	void setInput(CreateEmbeddingRequest_input  input);
	/*! \brief Get 
	 */
	CreateEmbeddingRequest_model getModel();

	/*! \brief Set 
	 */
	void setModel(CreateEmbeddingRequest_model  model);
	/*! \brief Get The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
	 */
	std::string getEncodingFormat();

	/*! \brief Set The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
	 */
	void setEncodingFormat(std::string  encoding_format);
	/*! \brief Get The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
	 */
	int getDimensions();

	/*! \brief Set The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
	 */
	void setDimensions(int  dimensions);
	/*! \brief Get A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
	 */
	std::string getUser();

	/*! \brief Set A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
	 */
	void setUser(std::string  user);


    private:
    CreateEmbeddingRequest_input input;
    CreateEmbeddingRequest_model model;
    std::string encoding_format{};
    int dimensions{};
    std::string user{};
};
}

#endif /* TINY_CPP_CLIENT_CreateEmbeddingRequest_H_ */
