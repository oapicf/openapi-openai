/*
 * StaticChunkingStrategyRequestParam.h
 *
 * 
 */

#ifndef _StaticChunkingStrategyRequestParam_H_
#define _StaticChunkingStrategyRequestParam_H_


#include <string>
#include "StaticChunkingStrategy.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class StaticChunkingStrategyRequestParam : public Object {
public:
	/*! \brief Constructor.
	 */
	StaticChunkingStrategyRequestParam();
	StaticChunkingStrategyRequestParam(char* str);

	/*! \brief Destructor.
	 */
	virtual ~StaticChunkingStrategyRequestParam();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string type;
	StaticChunkingStrategy r_static;
	void __init();
	void __cleanup();

};
}
}

#endif /* _StaticChunkingStrategyRequestParam_H_ */
