//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'chat_completion_role.g.dart';

class ChatCompletionRole extends EnumClass {

  /// The role of the author of a message
  @BuiltValueEnumConst(wireName: r'system')
  static const ChatCompletionRole system = _$system;
  /// The role of the author of a message
  @BuiltValueEnumConst(wireName: r'user')
  static const ChatCompletionRole user = _$user;
  /// The role of the author of a message
  @BuiltValueEnumConst(wireName: r'assistant')
  static const ChatCompletionRole assistant = _$assistant;
  /// The role of the author of a message
  @BuiltValueEnumConst(wireName: r'tool')
  static const ChatCompletionRole tool = _$tool;
  /// The role of the author of a message
  @BuiltValueEnumConst(wireName: r'function')
  static const ChatCompletionRole function_ = _$function_;

  static Serializer<ChatCompletionRole> get serializer => _$chatCompletionRoleSerializer;

  const ChatCompletionRole._(String name): super(name);

  static BuiltSet<ChatCompletionRole> get values => _$values;
  static ChatCompletionRole valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ChatCompletionRoleMixin = Object with _$ChatCompletionRoleMixin;

