
/*
 * BatchRequestInput.h
 *
 * The per-line object of the batch input file
 */

#ifndef TINY_CPP_CLIENT_BatchRequestInput_H_
#define TINY_CPP_CLIENT_BatchRequestInput_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The per-line object of the batch input file
 *
 *  \ingroup Models
 *
 */

class BatchRequestInput{
public:

    /*! \brief Constructor.
	 */
    BatchRequestInput();
    BatchRequestInput(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BatchRequestInput();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
	 */
	std::string getCustomId();

	/*! \brief Set A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
	 */
	void setCustomId(std::string  custom_id);
	/*! \brief Get The HTTP method to be used for the request. Currently only `POST` is supported.
	 */
	std::string getMethod();

	/*! \brief Set The HTTP method to be used for the request. Currently only `POST` is supported.
	 */
	void setMethod(std::string  method);
	/*! \brief Get The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.
	 */
	std::string getUrl();

	/*! \brief Set The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.
	 */
	void setUrl(std::string  url);


    private:
    std::string custom_id{};
    std::string method{};
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_BatchRequestInput_H_ */
