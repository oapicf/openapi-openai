
/*
 * OtherChunkingStrategyResponseParam.h
 *
 * This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the &#x60;chunking_strategy&#x60; concept was introduced in the API.
 */

#ifndef TINY_CPP_CLIENT_OtherChunkingStrategyResponseParam_H_
#define TINY_CPP_CLIENT_OtherChunkingStrategyResponseParam_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the `chunking_strategy` concept was introduced in the API.
 *
 *  \ingroup Models
 *
 */

class OtherChunkingStrategyResponseParam{
public:

    /*! \brief Constructor.
	 */
    OtherChunkingStrategyResponseParam();
    OtherChunkingStrategyResponseParam(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OtherChunkingStrategyResponseParam();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Always `other`.
	 */
	std::string getType();

	/*! \brief Set Always `other`.
	 */
	void setType(std::string  type);


    private:
    std::string type{};
};
}

#endif /* TINY_CPP_CLIENT_OtherChunkingStrategyResponseParam_H_ */
