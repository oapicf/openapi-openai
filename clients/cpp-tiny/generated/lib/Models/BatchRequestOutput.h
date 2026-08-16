
/*
 * BatchRequestOutput.h
 *
 * The per-line object of the batch output and error files
 */

#ifndef TINY_CPP_CLIENT_BatchRequestOutput_H_
#define TINY_CPP_CLIENT_BatchRequestOutput_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BatchRequestOutput_error.h"
#include "BatchRequestOutput_response.h"

namespace Tiny {


/*! \brief The per-line object of the batch output and error files
 *
 *  \ingroup Models
 *
 */

class BatchRequestOutput{
public:

    /*! \brief Constructor.
	 */
    BatchRequestOutput();
    BatchRequestOutput(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BatchRequestOutput();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get A developer-provided per-request id that will be used to match outputs to inputs.
	 */
	std::string getCustomId();

	/*! \brief Set A developer-provided per-request id that will be used to match outputs to inputs.
	 */
	void setCustomId(std::string  custom_id);
	/*! \brief Get 
	 */
	BatchRequestOutput_response getResponse();

	/*! \brief Set 
	 */
	void setResponse(BatchRequestOutput_response  response);
	/*! \brief Get 
	 */
	BatchRequestOutput_error getError();

	/*! \brief Set 
	 */
	void setError(BatchRequestOutput_error  error);


    private:
    std::string id{};
    std::string custom_id{};
    BatchRequestOutput_response response;
    BatchRequestOutput_error error;
};
}

#endif /* TINY_CPP_CLIENT_BatchRequestOutput_H_ */
