
/*
 * StaticChunkingStrategyResponseParam.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_StaticChunkingStrategyResponseParam_H_
#define TINY_CPP_CLIENT_StaticChunkingStrategyResponseParam_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "StaticChunkingStrategy.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class StaticChunkingStrategyResponseParam{
public:

    /*! \brief Constructor.
	 */
    StaticChunkingStrategyResponseParam();
    StaticChunkingStrategyResponseParam(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~StaticChunkingStrategyResponseParam();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Always `static`.
	 */
	std::string getType();

	/*! \brief Set Always `static`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	StaticChunkingStrategy getRStatic();

	/*! \brief Set 
	 */
	void setRStatic(StaticChunkingStrategy  r_static);


    private:
    std::string type{};
    StaticChunkingStrategy r_static;
};
}

#endif /* TINY_CPP_CLIENT_StaticChunkingStrategyResponseParam_H_ */
